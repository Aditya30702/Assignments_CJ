package Assignment;

public class AccOverdraw implements Runnable{

    public Account acc = new Account();
    
    public void run() {
        for(int i=0; i<4; i++){
            makewithraw(300);
            if(acc.balance<0){
                System.out.println("the account is overdrawn..");
            }
        }
    }
    public void makewithraw(int x) {
        if(acc.balance >= x){
            System.out.println(Thread.currentThread().getName()+" is going to withraw : "+ x);
            System.out.println("Current balance : "+ acc.balance);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Sorry ! some error occured.....");
        }
        acc.withraw(x);
        System.out.println("The withrawal is completed on : "+ Thread.currentThread().getName());
        System.out.println("Remaining Balance : "+ acc.balance);
    
    }
    else{
    System.out.println("Amount is not enough to withrawal in account for "+Thread.currentThread().getName());
    System.out.println("The remaining balance is : "+ acc.balance);
    }
}
}
