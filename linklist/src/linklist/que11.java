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
public class que11 {
    public static void que11(){
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
  for(int p=0; p < l_list.size(); p++)
   {
      System.out.println("Element at index "+p+": "+l_list.get(p));
    } 
     }
}
