/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knight
 */
public class Circle extends CalculateArea{
   
       public  Circle (double r) {
           super(r);
        
    }
       
     public void getArea() {
        double a= 3.1416*radius*radius;
        System.out.println("Area of Circle: "+ a); 
    }
    
}
