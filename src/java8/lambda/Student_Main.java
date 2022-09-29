package collections.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student_Main {
    public static void main(String...ar)
    {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<Student> list=new ArrayList<Student>();
    	list.add(new Student("Dev",100,"AITR"));
    	list.add(new Student("XYZ",200,"NIT"));
    	list.add(new Student("Abhay",101,"AITR"));
    	list.add(new Student("Ram",220,"IIT"));
    	list.add(new Student("Aagar",102,"AITR"));
    	list.add(new Student("ABC",400,"SGSITS"));
    ArrayList<Student> l=new ArrayList<Student>();
    	 l=(ArrayList<Student>) list.stream().filter(str->str.getName().substring(0,1).equalsIgnoreCase("A")).collect(Collectors.toList());
    Collections.sort(l,(l1,l2)->l1.getName().compareToIgnoreCase(l2.getName()));
    for(Student s : l)
    System.out.println(s.toString());
    }
}
