package thread.synchronization;

public class Res_Main {
   public static void main(String...ar)
   {
	   Restaurant r=new Restaurant();
	   new Thread() {
		   public void run()
		   {
			   r.order_status();
		   }
	   }.start();
	   new Thread() {
		   public void run() {
			   r.prepare();
		   }
	   }.start();
   }
}
