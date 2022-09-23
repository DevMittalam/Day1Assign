package epotral.assignment;

import java.util.Comparator;

public class SortId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStu_id()-o2.getStu_id();
	}

}
