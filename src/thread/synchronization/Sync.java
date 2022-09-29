package thread.synchronization;

public class Sync extends Thread {
    Bank b;  
	public Sync(Bank b)
      {
    	  this.b=b;
      }
	@Override
	public void run() {
        try {
			b.printWithSyn(500);
			b.printWithSyn(200);
			b.printWithSyn(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}

}
