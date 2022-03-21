package Assignment;

import java.util.Scanner;

public class Cone implements Shapes {
    double rad;
    double hg;
    Scanner scan = new Scanner(System.in);

    public void Enter() {
        try {
            System.out.print("\nEnter radius of cone : ");
            rad = scan.nextInt();
            System.out.println();
            System.out.print("\nEnter height of cone : ");
            hg = scan.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Enter the correct input......");
        }
    }

    public void surfaceArea() {
        double surfacearea = 3.142 * rad * (rad + Math.sqrt(hg * hg + rad * rad));
        System.out.println("Surface area of Cone = " + surfacearea); 
    }

    public void curvedSurfaceArea() {
        double curvedsurfacearea = 3.142 * rad * Math.sqrt(hg * hg + rad * rad);
        System.out.println("Curved surface area of Cone = " + curvedsurfacearea); 
    }

    public void parameter() {
        throw new ArithmeticException("Sorry !, Cone does not have Parameters.");
    }

    public void area() {
        throw new ArithmeticException("Sorry !, Cone does not have Area.");
    }

    public void volume() {
        throw new ArithmeticException("Sorry !, Cone does not have Volume.");
    } 
}
