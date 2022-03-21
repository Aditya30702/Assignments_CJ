package Assignment;

import java.util.Scanner;

public class Rectangle implements Shapes {
    double length;
    double breadth;
    Scanner scan = new Scanner(System.in);
    
    public void Enter() {
        try {
            System.out.print("\nEnter length of rectangle : ");
            length = scan.nextDouble();
            System.out.println();
            System.out.print("\nEnter width of rectangle : ");
            breadth = scan.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
    
    public void parameter() {
        double parameter = 2 * (length + breadth);
        System.out.println("Parameter of Square = " + parameter); 
    }
    
    public void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    
    public void surfaceArea() {
        throw new ArithmeticException("Sorry !, Rectangle does not have Surface Area.");
    }
    
    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, Rectangle does not have Curved Surface Area.");
    }
    
    public void volume() {
        throw new ArithmeticException("Sorry !, Rectangle does not have Volume.");
    }

}
