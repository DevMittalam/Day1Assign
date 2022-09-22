package collections.framework;

import java.util.Scanner;

public class Lib_Main {
    public static void main(String...ar)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Welcome to My Library");
    	LibOperations op=new LibOperations();
    	 while(true) {
    	System.out.println("1.Enter a member");
    	System.out.println("2.View Members");
    	System.out.println("3.View Member by address");
    	System.out.println("4.Exit");
    	 int n=sc.nextInt();
    	  if(n==1)
    	  { 
    		  System.out.println("Enter a member name");
    		  String s=sc.next();
    		  System.out.println("Enter id");
    		  String id=sc.next();
    		  System.out.println("Enter address");
    		  String ad=sc.next();
    		  op.add(s,id,ad);
    	  }
    	  else if(n==2)
    	  {
    		  op.display();
    	  }
    	  else if(n==3)
    	  {
    		  System.out.println("Enter a address");
    		  String ad=sc.next();
    		  op.address(ad);
    	  }
    	  else
    	  {
    		  break;
    	  }
    	 }
    	 System.out.println("Thank you");
    }
}
