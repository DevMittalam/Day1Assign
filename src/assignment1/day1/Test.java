package assignment1.day1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[26];
         String s=sc.next();
         for(int i=0;i<s.length();i++)
         {
        	 a[s.charAt(i)-'a']++;
         }
         String r="";
         for(int i=0;i<s.length();i++)
         {
        	 if(a[s.charAt(i)-'a']==0)
        		 continue;
        	 else {
        	 r=r+s.charAt(i)+(a[s.charAt(i)-'a']);
        	 a[s.charAt(i)-'a']=0;
        	 }
         }
         System.out.println(r);
	}

}
