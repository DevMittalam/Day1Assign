package day5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
//Day_5
//excep
public class Exception_assign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter number of items:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter prices");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
		  System.out.println("Enter index number for details");
		    try {
		    	int in=sc.nextInt();
		    	System.out.println(a[in]);
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	e.printStackTrace();
		    	System.out.println("Enter a low index");
		    }
		}
		catch(InputMismatchException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
