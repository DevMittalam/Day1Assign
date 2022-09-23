package epotral.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class Operations {
        ArrayList<Student>list1=new ArrayList<Student>();
        ArrayList<Course>list2=new ArrayList<Course>();
        ArrayList<BothDetails> enroll=new ArrayList<BothDetails>();
        public void addCourse(int id,String name,String des)
        {
        	list2.add(new Course(id,name,des));
        }
		public void addStudent(String name, int id, String ad, String dep) {
			list1.add(new Student(name,id,ad,dep));
		}
		public void displayCourse() {
			 for(int i=0;i<list2.size();i++)
			 {
				 System.out.println(list2.get(i).toString());
			 }
		}
		public void enrolls(int id, int cid) {
			enroll.add(new BothDetails(id,cid));
			
		}
		public void displayCourse(int id) {
			ArrayList<Student> s=new ArrayList<Student>();
			for(int i=0;i<enroll.size();i++)
			{
				if(enroll.get(i).getCId()==id)
				{
					for(int j=0;j<list1.size();j++)
					{
						if(enroll.get(i).getStuId()==list1.get(j).getStu_id())
						{
							s.add(list1.get(i));
						}
					}
				}
			}
		       Collections.sort(s,new SortId());
		       for(int i=0;i<s.size();i++)
		       {
		    	   System.out.println(s.get(i).toString());
		       }
		}
}
