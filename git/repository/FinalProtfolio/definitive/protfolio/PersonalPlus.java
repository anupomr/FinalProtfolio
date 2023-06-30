package definitive.protfolio;

public class PersonalPlus {

	public static void main(String[] args) {
		// Driver
		LinkedList perPlus =new LinkedList();
		perPlus.print();
		Contact nc=new Contact("Anupom", "Hamilton East", "abc@gmail.com", 356341256);
		perPlus.insert(nc);
		perPlus.print();

	}

}
