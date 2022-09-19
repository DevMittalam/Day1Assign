package com.project;

public class Overloading {
      public int sum(int a,int b) {
      return a+b;
      }
      public int sum(int a,int b,int c)
      {
    	  return a+b+c;
      }
      public int sum(int a,int b,int c,int d)
      {
    	  return a+b+c+d;
      }
      public void  average(int a,int b)
      {
    	  System.out.println("Sum :"+sum(a,b));
    	  System.out.println("Avg :"+sum(a,b)/2);
      }
      public void average(int a,int b,int c)
      {
    	  System.out.println("Sum :"+sum(a,b,c));
    	  System.out.println("Avg :"+sum(a,b,c)/2);
      }
      public void average(int a,int b,int c,int d)
      {
    	  System.out.println("Sum :"+sum(a,b,c,d));
    	  System.out.println("Avg :"+sum(a,b,c,d)/2);
      }
	public static void main(String[] args) {
		Overloading load=new Overloading();
		load.average(10, 20);
		load.average(10, 20,30);
	}

}
