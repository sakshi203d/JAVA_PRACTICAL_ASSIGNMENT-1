/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Desai
 */
public class que16 {
    public static void que16(){
      ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
          System.out.println("Cloned array list: " + newc1);        
   } 
}
