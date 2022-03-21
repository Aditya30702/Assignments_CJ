package Assignment;

import java.io.Serializable;

public class Student implements Serializable {
    public String FirstName;
    public String DateOfBirth;
    public Address Address;

    Student(String N, String string, String a, String b, String c, int d ){
        this.FirstName = N;
        this.DateOfBirth = string;

        Address = new Address(a ,b ,c ,d);
    }
}

