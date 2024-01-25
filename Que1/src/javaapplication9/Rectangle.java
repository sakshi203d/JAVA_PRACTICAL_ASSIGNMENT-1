/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Desai
 */
public class Rectangle extends Shape {
    // instance variables
    private int length;
    private int width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(String color, int length, int width)
    {
        // initialise instance variables
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // Overriding getArea() method from Shape class
    @Override
    public double getArea()
    {
        // put your code here
        return this.length * this.width;
    }
    
    // Overriding toString() method
    @Override
    public String toString(){
        return "=== RECTANGLE === \nLENGTH = "+this.length+"\nWIDTH = "+this.width+"\n"+super.toString();
    }
}
