package multithreading.all;

public class Demos implements Runnable{

	public Demos(int n)
	{
		Thread t=new Thread(this);
		t.setPriority(n);
		System.out.println("thread Priority is "+n);
		t.run();
	}
	@Override
	public void run() {
		System.out.println("Hello Thread");
	}

}
