package map.all;

import java.util.HashMap;
import java.util.Map;

public class Student_Main {

	public static void main(String[] args) {
         Map<Integer,Student>map=new HashMap<Integer,Student>();
         map.put(1001,new Student("Dev",1001,"IT"));
         map.put(1002,new Student("Suraj",1002,"IT"));
         map.put(1003,new Student("Shayam",1003,"IT"));
         map.put(1004,new Student("ABC",1004,"IT"));
         map.put(1005,new Student("Ram",1005,"IT"));
         for(int n : map.keySet())
         {
        	 if(map.get(n).getName().substring(0,1).equalsIgnoreCase("S"))
        	 {
        		 System.out.println(map.get(n).toString());
        	 }
         }
	}

}
