package Assignment;

import java.util.Scanner;

public class Cube implements Shapes {
    double side;
    double peri;
    Scanner sc = new Scanner(System.in);

    public void Enter() {
        try {
            System.out.print("\nEnter side of cube : ");
            side = sc.nextInt();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public void parameter() {
        double parameter = 12 * side;
        System.out.println("Parmeter of Cube is = " + parameter);
    }

    public void volume() {
        double volume = side * side * side;
        System.out.println("Volume of Cube is = " + volume);
    }
    
    public void surfaceArea() {
        double surfacearea = 6 * side * side;
        System.out.println("Surface area of Cube is = " + surfacearea);
    }

    public void area() {
        throw new ArithmeticException("Sorry !, Cube does not have the Area.");
    }

    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, Cube does not have the Curved Surface Area."); 
    }

}
