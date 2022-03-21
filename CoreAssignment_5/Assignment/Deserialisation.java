package Assignment;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialisation{
    public static void main(String[] args){
        
        ArrayList<Student> info = new ArrayList<>();
try{
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("D:\\Hotwax\\assignments\\CoreAssignment_5\\Output1.ser"));
          
            for(int i=0;i<3;i++){
                Student stud = (Student)ob.readObject();
                info.add(stud);
                System.out.println(stud.FirstName+"\n"+stud.DateOfBirth);
                System.out.println(stud.Address);
            }
            
            ob.close();
        }catch(Exception e){
            e.printStackTrace();
        }
}
}