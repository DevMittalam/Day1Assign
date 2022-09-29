package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Sort_Main {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("ABC",20));
		list.add(new Student("XYZ",19));
		list.add(new Student("Dev",21));
		list.add(new Student("Ram",19));
		Collections.sort(list,(st1,st2)->st1.getAge()-st2.getAge());
		for(Student s : list)
		System.out.println(s);
		
	}

}
