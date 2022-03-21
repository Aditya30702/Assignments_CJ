package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapesInput {
    public static int Input(){
        int select;
        try{
            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();
            return select;
            }
            catch(Exception e){
                throw new InputMismatchException();
            
            }   
}
}
