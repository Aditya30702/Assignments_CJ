package Assignment;

public class Account{
    public int balance = 1000;

    public int withraw(int amount){
        
        balance = balance - amount;
        return amount;   
    }
}