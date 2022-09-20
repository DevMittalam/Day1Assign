package assign.day4;

public class Hostellers extends Student{

	int hostelNumber;
	int Roomnumber;
	public Hostellers(String name ,String regId,String department,int hostelNumber ,int Roomnumber) {
		this.hostelNumber=hostelNumber;
		this.Roomnumber=Roomnumber;
	    super.name=name;
	    super.regId=regId;
	    super.department=department;
	}
	
	@Override
	public void display() {
		System.out.println("Name : "+name+"\n"+"Id :"+regId+"\nDepartment : "+department);
		System.out.println("hostel no. :"+hostelNumber+"\n room no. :"+Roomnumber);
		
	}
    
}
