
public class Person {
	
	private String firstName;
	private String lastName;
	private String address;
	private String application;
	
	public Person (String firstName, String lastName, String address, String application) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.application = application;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getAddress() {
		return address;
	}
	public String getApplication() {
		 return "Name: "  + firstName +" " +lastName+ "'s application: " + application +"\n";
	}
	public String toString() {
		
		return "Name: "  + firstName +" " +lastName+ "\n Lives at: " + address +"\n";
	}
	
	
}
