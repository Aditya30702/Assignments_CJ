package Assignment;

public class ShapeList {
        static String[] names = {"1. Circle ; 2. Cone ; 3. Cube ; 4. Cylinder ; 5. Rectangle ; 6. Sphere ; 7. Square ; 8. Triangle"};
        public static void display(){
            System.out.println("Select a Shape : ");
            for(int i=0 ; i<names.length ; i++){
                System.out.println((i+1)+") "+ names[i]);
            }
    }
}
