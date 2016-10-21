/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knight
 */
public class Triangle extends CalculateArea{

    public Triangle(double h, double w) {
        super(h, w);
    }
    
    @Override
     public void getArea() {
        double a =  (height * width)/2;
        System.out.println("Area of Triangle: "+ a); 
     }
    
}
