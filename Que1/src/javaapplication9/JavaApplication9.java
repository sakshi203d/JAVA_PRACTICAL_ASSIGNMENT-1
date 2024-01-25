/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Desai
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // upcasting
        Shape rect = new Rectangle("blue", 10, 3);
        System.out.println(rect); // rect.toString()
        
        System.out.println("\nArea of Rectangle = "+rect.getArea()+"\n\n");
        
        Shape tri = new Triangle("green", 8, 5);
        System.out.println(tri); // tri.toString()
        
        System.out.println("\nArea of Triangle = "+tri.getArea()+"\n\n");
        
        // downcasting
        Rectangle shape = (Rectangle)rect;
        System.out.println(shape); // shape.toString()
        System.out.println("\nArea of Rectangle = "+shape.getArea());
    }
    
}
