package Assignment;

import java.util.Scanner;

public class Triangle implements Shapes {
    double hg;
    double side1,side2,side3;
    Scanner scan = new Scanner(System.in);

    public void Enter() {
        hg = 0;
        try {
            System.out.print("\nEnter height of triangle : ");
            hg = scan.nextDouble();
            System.out.print("\nEnter side1 of triangle : ");
            side1 = scan.nextDouble();
            System.out.print("\nEnter side2 of triangle : ");
            side2 = scan.nextDouble();
            System.out.print("\nEnter side3 of triangle : ");
            side3 = scan.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public void area() {
        double area = (side1* hg)/2;
        System.out.println("Area of Triangle = " + area);
    }

    public void parameter() {
        double parameter = side1 + side2 + side3;
        System.out.println("Parameter of Triangle = " + parameter);
    }

    public void surfaceArea() {
        throw new ArithmeticException("Sorry !, Triangle does not have Surface Area.");
    }

    public void curvedSurfaceArea() {
        throw new ArithmeticException("Sorry !, Triangle does not have Curved Surface Area.");
    }

    public void volume() {
        throw new ArithmeticException("Sorry !, Triangle does not have Volume.");
    }
}
