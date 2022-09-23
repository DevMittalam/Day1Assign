package phonebook.simulator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operations_Book{
    ArrayList<PhoneBook> list=new ArrayList<PhoneBook>();
	public boolean validate(String con) {
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(con);
		return (m.find()&&m.group().equals(con));	
	}

	public void add(String s, String con) {
		list.add(new PhoneBook(s,con));
	}

	public void display() {
	   for(int i=0;i<list.size();i++)
		   System.out.println(list.get(i).toString());
	}

	public void searchByName(String s) {
		list.stream().filter(p->p.getName().equalsIgnoreCase(s)).forEach(System.out::println);
	}
	public void searchByNumber(String s) {
		list.stream().filter(p->p.getNumber().equalsIgnoreCase(s)).forEach(System.out::println);
	}

	public void delete(String con) {
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getNumber().equals(con))
			{
				list.remove(i);
				break;
			}
		}
	}
	

}
