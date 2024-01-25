/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treeset;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Desai
 */
public class Treeset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // 1. Create a tree set, add colors, and print
        TreeSet<String> colorSet = new TreeSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Yellow");
        System.out.println("1. Tree set with colors: " + colorSet);

        // 2. Iterate through all elements
        System.out.println("\n2. Iterating through elements:");
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Add all elements to another tree set
        TreeSet<String> anotherSet = new TreeSet<>();
        anotherSet.addAll(colorSet);
        System.out.println("\n3. Copied tree set: " + anotherSet);

        // 4. Create reverse order view
        System.out.println("\n4. Reverse order view: " + colorSet.descendingSet());

        // 5. Get first and last elements
        System.out.println("\n5. First element: " + colorSet.first());
        System.out.println("   Last element: " + colorSet.last());

        // 6. Clone a tree set
        TreeSet<String> clonedSet = (TreeSet<String>) colorSet.clone();
        System.out.println("\n6. Cloned tree set: " + clonedSet);

        // 7. Get number of elements
        System.out.println("\n7. Number of elements: " + colorSet.size());

        // 8. Compare two tree sets
        TreeSet<String> compareSet = new TreeSet<>();
        compareSet.add("Red");
        compareSet.add("Green");
        compareSet.add("Blue");
        System.out.println("\n8. Comparing two tree sets: " + colorSet.equals(compareSet));

        // 9. Find numbers less than 7
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(3);
        numberSet.add(8);
        System.out.println("\n9. Numbers less than 7: " + numberSet.headSet(7));

        // 10. Get element greater than or equal to given element
        System.out.println("\n10. Element greater than or equal to 5: " + numberSet.ceiling(5));

        // 11. Get element less than or equal to given element
        System.out.println("11. Element less than or equal to 8: " + numberSet.floor(8));

        // 12. Get element strictly greater than or equal to given element
        System.out.println("12. Element strictly greater than or equal to 6: " + numberSet.higher(6));

        // 13. Get element with lower value than given element
        System.out.println("13. Element with lower value than 8: " + numberSet.lower(8));

        // 14. Retrieve and remove first element
        System.out.println("\n14. Retrieve and remove first element: " + colorSet.pollFirst());

        // 15. Retrieve and remove last element
        System.out.println("15. Retrieve and remove last element: " + colorSet.pollLast());

        // 16. Remove a given element
        colorSet.remove("Green");
        System.out.println("\n16. Tree set after removing 'Green': " + colorSet);
    }
    
}
