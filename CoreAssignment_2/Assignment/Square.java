package Assignment;

import java.util.Scanner;

public class Square implements Shapes {
    double side;
    Scanner scan = new Scanner(System.in);
    
    public void Enter() {
        try {
            System.out.print("\nEnter side of square : ");
            side = scan.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
    
    public void area() {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public void parameter() {
        double parameter = 4 * side;
        System.out.println("Parameter of Square = " + parameter);
    }
    
    public void surfaceArea() {
        throw new ArithmeticException("Sorry !, Square does not have Surface Area."); 
    }
    
    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, Square does not have Curved Surface Area.");
    }
    
    public void volume() {
        throw new ArithmeticException("Sorry !, Square does not have Volume.");
    }

}
