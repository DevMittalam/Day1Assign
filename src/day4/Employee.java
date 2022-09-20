package assign.day4;
//
public abstract class Employee {
	protected int salary;
	protected int pfAmountper;
	protected int loanAmount;
       public abstract void getSalary();
       public abstract void getpfAmount();
       public abstract void getLoanAmount();
       
       public int calPf() {
    	   return (pfAmountper*salary)/100;
       }
       public int calSalary() {
    	   return salary-calPf();
       }
       public int calAmount() {
    	   return (loanAmount*salary)/100;
       }
       public void display() {
   		System.out.println("Employee [salary=" + salary + ", pfAmountper=" + pfAmountper + ", loanAmount=" + loanAmount + "]");
   	}
}
