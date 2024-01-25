/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Desai
 */
public class Hashtable {

    public static void main(String[] args) {

        // 1. Append the specified element to the end of a hash set
        exercise1();

        // 2. Iterate through all elements in a hash set
        exercise2();

        // 3. Get the number of elements in a hash set
        exercise3();

        // 4. Empty a hash set
        exercise4();

        // 5. Test if a hash set is empty or not
        exercise5();

        // 6. Clone a hash set to another hash set
        exercise6();

        // 7. Convert a hash set to an array
        exercise7();

        // 8. Convert a hash set to a tree set
        exercise8();

        // 9. Find numbers less than 7 in a tree set
        exercise9();

        // 10. Compare two hash sets
        exercise10();

        // 11. Compare two sets and retain elements that are the same
        exercise11();

        // 12. Remove all elements from a hash set
        exercise12();
    }

    // Exercise 1
    private static void exercise1() {
        HashSet<String>  h_set = new HashSet<>();
         h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
        System.out.println("1. Appended Element: " +  h_set);
    }

    // Exercise 2
    private static void exercise2() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("red");
        hashSet.add("pink");
        hashSet.add("yellow");

        System.out.println("2. Iterating through hash set:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Exercise 3
    private static void exercise3() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("red");
        hashSet.add("pink");
        hashSet.add("yellow");

        System.out.println("3. Number of elements: " + hashSet.size());
    }

    // Exercise 4
    private static void exercise4() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        hashSet.clear();
        System.out.println("4. Emptied hash set: " + hashSet);
    }

    // Exercise 5
    private static void exercise5() {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("5. Is hash set empty? " + hashSet.isEmpty());
    }

    // Exercise 6
    private static void exercise6() {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Element1");
        originalSet.add("Element2");
        originalSet.add("Element3");

        HashSet<String> clonedSet = new HashSet<>(originalSet);
        System.out.println("6. Cloned hash set: " + clonedSet);
    }

    // Exercise 7
    private static void exercise7() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("7. Converted hash set to array: " + Arrays.toString(array));
    }

    // Exercise 8
    private static void exercise8() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("8. Converted hash set to tree set: " + treeSet);
    }

    // Exercise 9
    private static void exercise9() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(10);

        System.out.println("9. Numbers less than 7 in tree set: " + treeSet.headSet(7));
    }

    // Exercise 10
    private static void exercise10() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Element1");
        set1.add("Element2");
        set1.add("Element3");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Element1");
        set2.add("Element2");
        set2.add("Element4");

        System.out.println("10. Are hash sets equal? " + set1.equals(set2));
    }

    // Exercise 11
    private static void exercise11() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Element1");
        set1.add("Element2");
        set1.add("Element3");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Element2");
        set2.add("Element3");
        set2.add("Element4");

        set1.retainAll(set2);

        System.out.println("11. Common elements in sets: " + set1);
    }

    // Exercise 12
    private static void exercise12() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        hashSet.clear();
        System.out.println("12. Removed all elements from hash set: " + hashSet);
    }

    
}
