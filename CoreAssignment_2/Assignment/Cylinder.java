package Assignment;

import java.util.Scanner;

public class Cylinder implements Shapes {
    double rad;
    double hg;
    Scanner scan = new Scanner(System.in);
    
    public void Enter() {
        try {
            System.out.print("\nEnter radius of cylinder : ");
            rad = scan.nextDouble();
            System.out.println();
            System.out.print("\nEnter height of cylinder : ");
            hg = scan.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
    
    public void surfaceArea() {
        double surfacearea = 2 * 3.142 * rad * (rad + hg);
        System.out.println("Surface area of Cylinder = " + surfacearea);
    }
    
    public void curvedSurfaceArea() {
        double curvedsurfacearea = 2 * 3.142 * rad * hg;
        System.out.println("Curved surface area of Sphere = " + curvedsurfacearea);
    }
    
    public void volume() {
        double volume = 3.142 * rad * rad * hg;
        System.out.println("Volume of Sphere = " + volume);
    }

    public void parameter() {
        throw new ArithmeticException("Sorry !, Cylinder does not have Parameters.");
    }
    
    public void area() {
        throw new ArithmeticException("Sorry !, Cylinder does not have Area.");
    }
}
