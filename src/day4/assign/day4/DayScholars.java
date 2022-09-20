package assign.day4;

public class DayScholars extends Student{
		int hostelNumber;
		int Roomnumber;
		public DayScholars(String name ,String regId,String department) {
		    super.name=name;
		    super.regId=regId;
		    super.department=department;
		}
		
		@Override
		public void display() {
			System.out.println("Name : "+name+"\n"+"Id :"+regId+"\nDepartment : "+department);
			
		}	    
	}

