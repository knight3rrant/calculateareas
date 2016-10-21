/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knight
 */
public class CalculateArea {
    protected double height;
    protected double width;
protected double radius;

    public CalculateArea (double h,double w) {
        height = h;
        width = w;
    }

    public CalculateArea (double r) {
        radius = r;
       
    }
    public void getArea() {
        System.out.println("Area of Rectangle: "+ height * width); 
    }
    
}
