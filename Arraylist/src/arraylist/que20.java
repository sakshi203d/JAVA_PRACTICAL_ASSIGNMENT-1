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
public class que20 {
    public static void que20(){
        ArrayList<String> c1= new ArrayList<String>(3);
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          System.out.println("Original array list: " + c1);
          //Increase capacity to 6
          c1.ensureCapacity(6);
          c1.add("White");
          c1.add("Pink");
          c1.add("Yellow");
          System.out.println("New array list: " + c1);
   } 
}
