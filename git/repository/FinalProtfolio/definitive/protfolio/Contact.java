package definitive.protfolio;

public class Contact {
	String name,address, email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCell() {
		return cell;
	}
	public void setCell(int cell) {
		this.cell = cell;
	}
	int cell;
	public String toString() {
		return "contact [name=" + name + ", address=" + address + ", email=" + email + ", cell=" + cell + "]";
	}
	public Contact(String name, String address, String email, int cell) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.cell = cell;
	}

	
	
}
