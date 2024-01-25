import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExercises {
    public static void main(String[] args) {
        // 1. Create a priority queue, add colors, and print
        PriorityQueue<String> colorQueue = new PriorityQueue<>();
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        System.out.println("1. Priority queue with colors: " + colorQueue);

        // 2. Iterate through all elements
        System.out.println("\n2. Iterating through elements:");
        Iterator<String> iterator = colorQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Add all elements to another priority queue
        PriorityQueue<String> anotherQueue = new PriorityQueue<>(colorQueue);
        System.out.println("\n3. Copied priority queue: " + anotherQueue);

        // 4. Insert a given element into a priority queue
        colorQueue.offer("Purple");
        System.out.println("\n4. Inserted 'Purple': " + colorQueue);

        // 5. Remove all elements from a priority queue
        colorQueue.clear();
        System.out.println("\n5. Priority queue after clearing: " + colorQueue);

        // 6. Count the number of elements in a priority queue
        System.out.println("\n6. Number of elements: " + anotherQueue.size());

        // 7. Compare two priority queues
        PriorityQueue<String> compareQueue = new PriorityQueue<>();
        compareQueue.add("Red");
        compareQueue.add("Green");
        compareQueue.add("Blue");
        System.out.println("\n7. Comparing two priority queues: " + anotherQueue.equals(compareQueue));

        // 8. Retrieve the first element of the priority queue
        System.out.println("\n8. First element: " + anotherQueue.peek());

        // 9. Retrieve and remove the first element
        System.out.println("9. Retrieve and remove first element: " + anotherQueue.poll());

        // 10. Convert priority queue to an array
        String[] colorArray = anotherQueue.toArray(new String[0]);
        System.out.println("\n10. Priority queue converted to array: ");
        for (String color : colorArray) {
            System.out.print(color + " ");
        }

        // 11. Convert a Priority Queue element to string representations
        System.out.println("\n\n11. String representation of priority queue: " + anotherQueue.toString());

        // 12. Change priorityQueue to maximum priority queue
        PriorityQueue<String> maxPriorityQueue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        maxPriorityQueue.addAll(anotherQueue);
        System.out.println("\n12. Maximum priority queue: " + maxPriorityQueue);
    }
}
