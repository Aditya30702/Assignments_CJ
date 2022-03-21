import Assignment.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        bb:
        while(true){
            int select = 0;
            Scanner sc = new Scanner(System.in);
            ShapeList.display();
            System.out.println("Enter the shape's number to see result : ");
            try{
                select = ShapesInput.Input();
            }catch(InputMismatchException e){
                System.out.println("Exception occured !!");
                System.out.println("Enter again:");
                continue bb;
            }
            switch (select) {
                case 1:
                Circle cir = new Circle();
                try {
                    cir.Enter();
                    cir.area();
                    cir.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 2:
                Cone con = new Cone();
                try {
                    con.Enter();
                    con.area();
                    con.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 3:
                Cube cub = new Cube();
                try {
                    cub.Enter();
                    cub.area();
                    cub.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 4:
                Cylinder cyl = new Cylinder();
                try {
                    cyl.Enter();
                    cyl.area();
                    cyl.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 5:
                Rectangle rec = new Rectangle();
                try {
                    rec.Enter();
                    rec.area();
                    rec.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 6:
                Sphere sph = new Sphere();
                try {
                    sph.Enter();
                    sph.area();
                    sph.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 7:
                Square sqr = new Square();
                try {
                    sqr.Enter();
                    sqr.area();
                    sqr.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;

                case 8:
                Triangle tri = new Triangle();
                try {
                    tri.Enter();
                    tri.area();
                    tri.parameter();
                } catch (Exception e) {
                    System.out.println("\nInvalid Input!!!");
                }
                break;
            
                case 9:
                    System.out.println("You have selected this option to exit");
                    System.out.println("\n Thank Yout for using.....!!");
                    break bb;

            }
        }
    }
}
