package collections.framework;

public class Librarby_data {
     private String name;
     public Librarby_data(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		Address = address;
	}
	private String id;
     private String Address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Librarby_data [name=" + name + ", id=" + id + ", Address=" + Address + "]";
	}
     
}
