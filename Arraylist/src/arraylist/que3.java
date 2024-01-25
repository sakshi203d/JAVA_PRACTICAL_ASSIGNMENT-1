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
public class que3 {
       public static void que3(){
        
  // Creae a list and add some colors to the list
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("Red");
  list_Strings.add("Green");
  list_Strings.add("Orange");
  list_Strings.add("White");
  list_Strings.add("Black");
  // Print the list
  System.out.println(list_Strings);
  // Now insert a color at the first and last position of the list
  list_Strings.add(0, "Pink");
  list_Strings.add(5, "Yellow");
  // Print the list
  System.out.println(list_Strings);
 }

       }

