package Assignment;

import java.io.Serializable;

public class Address implements Serializable{
    public String city;
    public String state;
    public String country;
    public Integer pincode;

    public Address(String a, String b, String c, int d) {
        this.city = a;
        this.state = b;
        this.country = c;
        this.pincode = d;
    }
    
    
}
