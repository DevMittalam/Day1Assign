package test2.shopping;
import java.util.*;
public class Shopping_Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Operations op=new Operations();
		 try {
			 while(true) {
			 System.out.println("1.add to cart");
			 System.out.println("2.remove from cart");
			 System.out.println("3.view cart");
			 System.out.println("4.total bill");
			 System.out.println("5.bill with category");
			 System.out.println("6.Exit");
			  int i=sc.nextInt();
			  if(i==1)
			  {
				 System.out.println("Enter items category");
				 String cat=sc.next();
				 System.out.println("Enter item name");
				 String name=sc.next();
				 System.out.println("Enter quantity");
				 int qu=sc.nextInt();
				 System.out.println("Enter price");
				 float p=sc.nextFloat();
				 op.addToCart(cat, name, qu, p);
			  }
			  else if(i==2)
			  {
				  op.view();
				  System.out.println("Enter product id");
				  String id=sc.next();
				  op.removeFromCart(id);
			  }
			  else if(i==3)
			  {
				  op.view();
			  }
			  else if(i==4)
			  {
				op.totalBill();  
			  }
			  else if(i==5)
			  {
				  op.BillByCat();
			  }
			  else
			  {
				  break;
			  }
		     }
			 System.out.println("Thank you");
		 } 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
