package Assignment;

public class Mythread {
    public static void main(String[] args) {
        AccOverdraw acc = new AccOverdraw();
        //AccOverdrawSafe acc = new AccOverdrawSafe();
        Thread t1 = new Thread(acc);
        Thread t2 = new Thread(acc);
        t1.setName("Aditya");
        t2.setName("Atharv");
        
        t1.start();
        t2.start();
    }
}
