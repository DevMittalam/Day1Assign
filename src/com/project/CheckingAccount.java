package com.project;
//
public class CheckingAccount extends Account{
	public CheckingAccount(int p,int t)
	{
		super.setP(p);
		super.setT(t);
	}
	@Override
	public int rateOfInterest() {
		
		return (4*super.getP()*super.getT())/100;
	}
}
