package thread.synchronization;

public class Restaurant {
    boolean order=false;
	synchronized void order_status()
    {
    	if(!order)
    	{
    		System.out.println("preparing the dish");
    		try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    		System.out.println("dish is ready");
    }
	synchronized void prepare()
	{
	   System.out.println("Cooking....");
	   order=true;
	   notify();
	}
}
