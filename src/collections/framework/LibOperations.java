package collections.framework;

import java.util.ArrayList;

public class LibOperations {
    ArrayList<Librarby_data>list=new ArrayList<Librarby_data>();
    public void add(String s,String id,String a)
    {
    	list.add(new Librarby_data(s,id,a));
    }
    public void display() {
    	for(int i=0;i<list.size();i++)
    	{
    		System.out.println(list.get(i).toString());
    	}
    }
    public void address(String s)
    {
    	list.stream().filter(str->str.getAddress().equalsIgnoreCase(s)).forEach(System.out::println);
    }
}
