package Assignment;

import java.util.Scanner;

public class Sphere implements Shapes {
    double rad;
    Scanner scan = new Scanner(System.in);
    
    public void Enter() {
        try {
            System.out.print("\nEnter radius of sphere : ");
            rad = scan.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        } 
    }

    public void surfaceArea() {
        double surfacearea = 4 * 3.142 * rad * rad;
        System.out.println("Surface area of Sphere = " + surfacearea);
    }

    public void volume() {
        double volume = (4 / 3) * 3.142 * rad * rad * rad;
        System.out.println("Volume of Sphere = " + volume);
    }
    
    public void parameter() {
        throw new ArithmeticException("Sorry !, Sphere does not have Parameters.");
    }
    
    public void area() {
        throw new ArithmeticException("Sorry !, Sphere does not have Area.");
    }
    
    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, Sphere does not have Curved Surface Area.");
    }
}
