package assign.day4;
//
public class Permanent extends Employee {
    public Permanent() {
    	System.out.println("permanent");
    }
	@Override
	public void getSalary() {
		salary=10000;
	}
	@Override
	public void getpfAmount() {
		pfAmountper=10;
	}

	@Override
	public void getLoanAmount() {
		loanAmount=15;
	}
      
}
