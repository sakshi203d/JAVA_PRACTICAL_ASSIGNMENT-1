/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemapex;
import java.util.*;

public class TreeMapExercises {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("1. TreeMap with values: " + treeMap);

        // 2. Copy TreeMap's content to another TreeMap
        TreeMap<String, Integer> anotherTreeMap = new TreeMap<>(treeMap);
        System.out.println("\n2. Copied TreeMap: " + anotherTreeMap);

        // 3. Search for a key in a TreeMap
        String keyToSearch = "Two";
        System.out.println("3. Searching for key '" + keyToSearch + "': " + treeMap.containsKey(keyToSearch));

        // 4. Search for a value in a TreeMap
        int valueToSearch = 3;
        System.out.println("4. Searching for value '" + valueToSearch + "': " + treeMap.containsValue(valueToSearch));

        // 5. Get all keys from a TreeMap
        Set<String> keys = treeMap.keySet();
        System.out.println("\n5. All keys: " + keys);

        // 6. Delete all elements from a TreeMap
        treeMap.clear();
        System.out.println("6. TreeMap after clearing: " + treeMap);

        // Re-populate the TreeMap for the following exercises
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // 7. Sort keys in a TreeMap using a comparator
        Comparator<String> customComparator = Collections.reverseOrder();
        TreeMap<String, Integer> sortedTreeMap = new TreeMap<>(customComparator);
        sortedTreeMap.putAll(treeMap);
        System.out.println("\n7. TreeMap sorted by keys in reverse order: " + sortedTreeMap);

        // 8. Get key-value mappings associated with the greatest and least keys
        System.out.println("\n8. Key-value mapping associated with the greatest key: " +
                sortedTreeMap.lastEntry());
        System.out.println("   Key-value mapping associated with the least key: " +
                sortedTreeMap.firstEntry());

        // 9. Get the first (lowest) and the last (highest) key
        System.out.println("\n9. First (lowest) key: " + sortedTreeMap.firstKey());
        System.out.println("   Last (highest) key: " + sortedTreeMap.lastKey());

        // 10. Get a reverse order view of the keys
        NavigableSet<String> reverseKeys = sortedTreeMap.descendingKeySet();
        System.out.println("\n10. Reverse order view of keys: " + reverseKeys);

        // 11. Get key-value mapping associated with the greatest key less than or equal to a given key
        String givenKey = "Two";
        System.out.println("11. Key-value mapping associated with the greatest key less than or equal to '"
                + givenKey + "': " + sortedTreeMap.floorEntry(givenKey));

        // 12. Get the greatest key less than or equal to a given key
        System.out.println("12. Greatest key less than or equal to '" + givenKey + "': " +
                sortedTreeMap.floorKey(givenKey));

        // 13. Get the portion of a map whose keys are strictly less than a given key
        System.out.println("13. Portion of map whose keys are strictly less than '" + givenKey + "': " +
                sortedTreeMap.headMap(givenKey, false));

        // 14. Get the portion of a map whose keys are less than (or equal to) a given key
        System.out.println("14. Portion of map whose keys are less than or equal to '" + givenKey + "': " +
                sortedTreeMap.headMap(givenKey, true));

        // 15. Get the least key strictly greater than the given key
        String greaterThanKey = "Three";
        System.out.println("\n15. Least key strictly greater than '" + greaterThanKey + "': " +
                sortedTreeMap.higherKey(greaterThanKey));

        // 16. Get key-value mapping associated with the greatest key strictly less than the given key
        System.out.println("16. Key-value mapping associated with the greatest key strictly less than '" +
                greaterThanKey + "': " + sortedTreeMap.lowerEntry(greaterThanKey));

        // 17. Get the greatest key strictly less than the given key
        System.out.println("17. Greatest key strictly less than '" + greaterThanKey + "': " +
                sortedTreeMap.lowerKey(greaterThanKey));

        // 18. Get a NavigableSet view of keys
        NavigableSet<String> navigableKeys = sortedTreeMap.navigableKeySet();
        System.out.println("\n18. NavigableSet view of keys: " + navigableKeys);

        // 19. Remove and get a key-value mapping associated with the least key
        Map.Entry<String, Integer> leastEntry = sortedTreeMap.pollFirstEntry();
        System.out.println("\n19. Removed and got key-value mapping associated with the least key: " +
                leastEntry + "\n   Updated TreeMap: " + sortedTreeMap);

        // 20. Remove and get a key-value mapping associated with the greatest key
        Map.Entry<String, Integer> greatestEntry = sortedTreeMap.pollLastEntry();
        System.out.println("20. Removed and got key-value mapping associated with the greatest key: " +
                greatestEntry + "\n   Updated TreeMap: " + sortedTreeMap);

        // Re-populate the TreeMap for the following exercises
        sortedTreeMap.put("One", 1);
        sortedTreeMap.put("Two", 2);
        sortedTreeMap.put("Three", 3);

        // 21. Get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive)
        String fromKey = "One";
        String toKey = "Three";
        System.out.println("\n21. Portion of map whose keys range from '" + fromKey + "' (inclusive) to '" +
                toKey + "' (exclusive): " + sortedTreeMap.subMap(fromKey, toKey));

        // 22. Get the portion of a map whose keys range from a given key to another key
        System.out.println("22. Portion of map whose keys range from '" + fromKey + "' to '" +
                toKey + "': " + sortedTreeMap.subMap(fromKey, true, toKey, true));

        // 23. Get a portion of a map whose keys are greater than or equal to a given key
        String greaterOrEqualKey = "Two";
        System.out.println("23. Portion of map whose keys are greater than or equal to '" +
                greaterOrEqualKey + "': " + sortedTreeMap.tailMap(greaterOrEqualKey));

        // 24. Get a portion of a map whose keys are greater than a given key
        System.out.println("24. Portion of map whose keys are greater than '" + greaterOrEqualKey + "': " +
                sortedTreeMap.tailMap(greaterOrEqualKey, false));

        // 25. Get key-value mapping associated with the least key greater than or equal to the given key
        System.out.println("\n25. Key-value mapping associated with the least key greater than or equal to '" +
                greaterOrEqualKey + "': " + sortedTreeMap.ceilingEntry(greaterOrEqualKey));

        // 26. Get the least key greater than or equal to the given key
        System.out.println("26. Least key greater than or equal to '" + greaterOrEqualKey + "': " +
                sortedTreeMap.ceilingKey(greaterOrEqualKey));
    }
}

