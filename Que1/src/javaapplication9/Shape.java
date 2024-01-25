/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Desai
 */
public class Shape {
  // instance variables
    private String color = "";

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String color)
    {
        // initialise instance variables
        this.color = color;
    }

    public double getArea()
    {
        // put your code here
        System.out.println("Create instance of any shape first..!");
        return 0;
    }
    // Overriding toString() method   
    @Override
    public String toString() {
        return "Color = "+ this.color;
    }  
}
