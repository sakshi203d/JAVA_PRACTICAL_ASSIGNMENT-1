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
public class que21 {
    public static void que21(){
       ArrayList<String>  color = new ArrayList<String>();

  color.add("Red");
  color.add("Green");

  System.out.println("Original array list: " + color);
  String new_color = "White";
  color.set(1,new_color);

  int num=color.size();
  System.out.println("Replace second element with 'White'."); 
  for(int i=0;i<num;i++)
  System.out.println(color.get(i));
   } 
}
