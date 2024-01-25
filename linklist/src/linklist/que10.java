/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linklist;
import java.util.LinkedList;
/**
 *
 * @author Desai
 */
public class que10 {
    public static void que10(){
     // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
      // print original list
   System.out.println("Original linked list:" + l_list);  
 
   // Find first element of the List
    Object first_element = l_list.getFirst();
    System.out.println("First Element is: "+first_element);
 
    // Find last element of the List
    Object last_element = l_list.getLast();
    System.out.println("Last Element is: "+last_element);
     }
}
