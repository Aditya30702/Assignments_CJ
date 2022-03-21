package Assignment;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialisationTest {
    public static void main(String[] args) {

        try{
            Student s1 = new Student("Aditya", "30-07-2002", "Indore", "MP", "India", 123456);
            Student s2 = new Student("Atharv", "27-10-2002", "Indore", "MP", "India", 123456);
            Student s3 = new Student("AkhilSagar", "27-02-2002", "Indore", "MP", "India", 123456);
            
            FileOutputStream fout = new FileOutputStream("D:\\Hotwax\\assignments\\CoreAssignment_5\\Output1.ser");
            try (ObjectOutputStream out = new ObjectOutputStream(fout)) 
            {
                ArrayList<Student> lis = new ArrayList<>();
                    lis.add(s1);
                    lis.add(s2);
                    lis.add(s3);

                for(int i=0;i<lis.size();i++){
                    out.writeObject(lis.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Some Error occured....!");
            e.printStackTrace();
        }

    }
}
