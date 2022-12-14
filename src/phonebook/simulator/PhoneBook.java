package phonebook.simulator;

public class PhoneBook {
    private String name;
    private String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneBook(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", number=" + number + "]";
	}
    
}
