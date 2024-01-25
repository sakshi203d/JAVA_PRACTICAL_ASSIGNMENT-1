/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package que3;

import java.sql.*;
import java.util.*;

public class Que3 {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");

            // Get the root categories (parent_category_id is null)
            List<Category> rootCategories = getCategoriesByParent(null);

            // Print the category tree starting from root categories
            for (Category rootCategory : rootCategories) {
                printCategoryTree(rootCategory, 0);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Category> getCategoriesByParent(Integer parentCategoryId) throws SQLException {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM Category_Master WHERE parent_category_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setObject(1, parentCategoryId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int categoryId = resultSet.getInt("Category_id");
                String categoryName = resultSet.getString("Category_name");
                int parentCategory = resultSet.getInt("parent_category_id");
                categories.add(new Category(categoryId, categoryName, parentCategory));
            }
        }
        return categories;
    }

    private static void printCategoryTree(Category category, int level) throws SQLException {
        // Indent based on level
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        // Print category name
        System.out.println(category.getName());

        // Get child categories recursively
        List<Category> childCategories = getCategoriesByParent(category.getId());
        for (Category childCategory : childCategories) {
            printCategoryTree(childCategory, level + 1);
        }
    }

    private static class Category {
        private int id;
        private String name;
        private int parentId;

        public Category(int id, String name, int parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getParentId() {
            return parentId;
        }
    }
}

