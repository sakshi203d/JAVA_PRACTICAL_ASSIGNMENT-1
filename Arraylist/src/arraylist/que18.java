/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.*;
/**
 *
 * @author Desai
 */
public class que18 {
    public static void que18(){
      ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
          c1.removeAll(c1);
          System.out.println("Array list after remove all elements "+c1);   
          System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());  
   } 
}
