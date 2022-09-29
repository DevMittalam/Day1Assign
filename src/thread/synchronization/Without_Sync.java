package thread.synchronization;

public class Without_Sync extends Thread {
    Bank b;  
	public Without_Sync(Bank b)
      {
    	  this.b=b;
      }
	@Override
	public void run() {
        try {
			b.printWithoutSyn(400);
			b.printWithoutSyn(100);
			b.printWithoutSyn(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}

}
