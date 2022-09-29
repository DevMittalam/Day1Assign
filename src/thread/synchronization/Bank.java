package thread.synchronization;

public class Bank {
	int amt;
	Bank(int amt)
	{
		this.amt=amt;
	}
  synchronized public void printWithSyn(int amt) throws InterruptedException {
	   System.out.println("Withdraw amount (Sync) "+amt+"Remaining is "+(this.amt-amt));
	   Thread.sleep(1000);
   }
   public void printWithoutSyn(int amt) throws InterruptedException
   {
	   System.out.println("Withdraw amount (Without_Sync) "+amt+"Remaining is "+(this.amt-amt));
	   Thread.sleep(1000);
   }
}
