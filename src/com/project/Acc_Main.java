package com.project;

public class Acc_Main {

	public static void main(String[] args) {
		Account a=new SavingAccount(1000, 5);
         System.out.println(a.rateOfInterest());
	}

}
