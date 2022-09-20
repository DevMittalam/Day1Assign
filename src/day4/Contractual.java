package assign.day4;
//
public class Contractual extends Employee{

	public Contractual() {
		System.out.println("Contractual");
	}
	@Override
	public void getSalary() {
		salary=5000;
	}

	@Override
	public void getpfAmount() {
		pfAmountper=5;
	}

	@Override
	public void getLoanAmount() {
		loanAmount=10;
	}

}
