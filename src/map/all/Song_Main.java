package map.all;

import java.util.Scanner;

public class Song_Main {
    public static void main(String[] ar)
    {
    	Scanner sc=new Scanner(System.in);
    	Song s=new Song(5);
	try{
    	while(true)
    	{
			System.out.println("1.Add Song");
			System.out.println("2.remove Song");
			System.out.println("3.Play Song");
			System.out.println("4.Song remaining");
			System.out.println("6.Exit");
		    int n=sc.nextInt();
		    if(n==1)
		    {
		    	System.out.println("Enter Song name");
		    	String name=sc.next();
		    	s.enqueue(name);
		    }
		    else if(n==2)
		    {
		    	System.out.println("2.Delete a Song");
		    	{
		    		s.dequeue();
		    	}
		    }
		    else if(n==3)
		    {
		    	System.out.println(s.front()+" Song is Playing");
		    }
		    else if(n==4)
		    {
		    	System.out.println(s.count()+" is remaining");
		    }
		    else
		    	break;
    	   }
	}
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
    }
}
