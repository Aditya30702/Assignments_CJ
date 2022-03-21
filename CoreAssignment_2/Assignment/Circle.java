package Assignment;

import java.util.Scanner;

public class Circle implements Shapes {
    public double radius;
    private Scanner scan = new Scanner(System.in);

    public void Enter() {
        try{System.out.print("\nEnter radius of circle : ");
        radius = scan.nextDouble();
        System.out.println();
    }catch(Exception e){
        System.out.println("Enter the correct input......");
    }
    }

    public void parameter() {
        double parameter = 2 * 3.142 * radius;
        System.out.println("Circumference of Circle = " + parameter);
    }

    public void area() {
        double area = 3.142 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    public void surfaceArea() {
        throw new ArithmeticException("Sorry !, The Circle does not have the Volume.");
    }

    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, The Circle does not have the Surface Area.");
    }

    public void volume() {
        throw new ArithmeticException("Sorry !, The Circle does not have the Volume."); 
    }
}
