package assign.day4;
//
public class Emp_Main {
   public static void main(String...ar)
   {
	   Empy_Factory ef=new Empy_Factory();
	   Employee emp1=ef.getPlan("contractual");
	   emp1.getSalary();
	   emp1.getpfAmount();
	   emp1.getLoanAmount();
	   emp1.display();
	   System.out.println("total salary : "+emp1.calSalary());
	   System.out.println("total loan : "+emp1.calAmount());
	   
   }
}
