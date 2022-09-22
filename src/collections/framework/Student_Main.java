package collections.framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main {
    public static void main(String...ar)
    {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<Student> list=new ArrayList<Student>();
    	list.add(new Student("Dev",100,"AITR"));
    	list.add(new Student("XYZ",200,"NIT"));
    	list.add(new Student("Abhay",101,"AITR"));
    	list.add(new Student("Ram",220,"IIT"));
    	list.add(new Student("Sagar",102,"AITR"));
    	list.add(new Student("ABC",400,"SGSITS"));
    	System.out.println("Enter Collage name");
    	String s=sc.nextLine();
    	 list.stream().filter(str->str.getCollage_name().equalsIgnoreCase(s)).forEach(System.out::println);
    }
}
