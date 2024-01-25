/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapExercises {
    public static void main(String[] args) {
        // 1. Associate the specified value with the specified key
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("1. HashMap with values: " + map);

        // 2. Count the number of key-value mappings
        System.out.println("\n2. Number of key-value mappings: " + map.size());

        // 3. Copy all mappings to another map
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.putAll(map);
        System.out.println("\n3. Copied map: " + anotherMap);

        // 4. Remove all mappings from a map
        map.clear();
        System.out.println("\n4. Map after clearing: " + map);

        // 5. Check if a map is empty
        System.out.println("\n5. Is the map empty? " + map.isEmpty());

        // Re-populate the map for the following exercises
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // 6. Get a shallow copy of the HashMap
        Map<String, Integer> shallowCopy = new HashMap<>(map);
        System.out.println("\n6. Shallow copy of the map: " + shallowCopy);

        // 7. Test if a map contains a mapping for the specified key
        String keyToTest = "Two";
        System.out.println("7. Does the map contain key '" + keyToTest + "'? " + map.containsKey(keyToTest));

        // 8. Test if a map contains a mapping for the specified value
        int valueToTest = 2;
        System.out.println("8. Does the map contain value '" + valueToTest + "'? " + map.containsValue(valueToTest));

        // 9. Create a set view of the mappings
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("\n9. Set view of mappings: " + entrySet);

        // 10. Get the value of a specified key
        String specifiedKey = "Three";
        int valueForKey = map.get(specifiedKey);
        System.out.println("\n10. Value for key '" + specifiedKey + "': " + valueForKey);

        // 11. Get a set view of the keys
        Set<String> keySet = map.keySet();
        System.out.println("11. Set view of keys: " + keySet);

        // 12. Get a collection view of the values
        Collection<Integer> values = map.values();
        System.out.println("12. Collection view of values: " + values);
    }
}

