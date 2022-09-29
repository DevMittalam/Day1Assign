package thread.synchronization;

public class Bank_Main {
    public static void main(String []ar)
    {
    	Bank b=new Bank(1000);
    	Without_Sync w=new Without_Sync(b);
    	Sync s=new Sync(b);
    	w.start();
    	s.start();
    }
}
