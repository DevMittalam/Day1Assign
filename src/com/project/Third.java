package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//main
class Employee{
	private String name;
	private int id;
	private int exp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Employee(String name, int id, int exp) {
		super();
		this.name = name;
		this.id = id;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", exp=" + exp + "]";
	}
	
}
class SortExp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getExp()-o2.getExp();
	}
	
}
public class Third {

	public static void main(String[] args) {
		ArrayList<Employee>list =new ArrayList<Employee>();
		list.add(new Employee("Ram",30,10));
		list.add(new Employee("Ram1",31,1));
		list.add(new Employee("Ram2",30,3));
		list.add(new Employee("Ram3",33,4));
		list.add(new Employee("Ram4",32,2));
		Collections.sort(list,new SortExp());
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
