package com.project;
class Student{
	private String name;
	private int age;
	private int marks;
	//constructor
	public Student(String name, int age, int marks) {
       if(marks>=30) {
		this.name = name;
		this.age = age;
		this.marks = marks;
       }
       else
    	   System.out.println("Less than 30");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student stu1=new Student("ram1",10,99);
       Student stu12=new Student("ram12",10,90);
       Student stu13=new Student("ram13",10,79);
       Student stu14=new Student("ram14",10,39);
       Student stu15=new Student("ram15",10,19);
	}

}
