package epotral.assignment;

public class Student {
    private String name;
    private int stu_id;
    private String address;
    private String department;
	public Student(String name, int stu_id, String address, String department) {
		super();
		this.name = name;
		this.stu_id = stu_id;
		this.address = address;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stu_id=" + stu_id + ", address=" + address + ", department=" + department
				+ "]";
	}
    
}
