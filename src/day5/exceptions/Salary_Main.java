package day5.exceptions;

import java.util.Scanner;

public class Salary_Main {

	public static void main(String[] args) throws SalaryException {
		Scanner s=new Scanner(System.in);
		try {
		String name=s.next();
		String g=s.next();
		int sal=s.nextInt();
		if(sal>=10000)
		{
			Candidate c=new Candidate(name,g,sal);
			System.out.println(c.toString());
		}
		else
		{
			throw new SalaryException("Salary is less than 10000");
		}
		}
		catch(SalaryException e)
		{
			System.out.println("Caught salary Exception");
		}
      System.out.println("Done");
	}

}
