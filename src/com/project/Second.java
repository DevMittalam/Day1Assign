package com.project;

public class Second {
//main
	public static void main(String[] args) {
		// TODO Auto-gene
		String s="i love java";
		String n="";
		String e[]=s.split(" ");
		for(String o:e) {
			n+=o.substring(0,1).toUpperCase()+o.substring(1);
			n+=" ";
		}
        System.out.println(n);
	}

}
