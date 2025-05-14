package Project;

public class Contact{
	
	private int id;
	private String phoneNumber,name,email;
	
	
	public Contact(int id, String phoneNumber, String name, String email) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString()
	{
		return "Id: "+id+" Name: "+name+" phoneNumber: "+phoneNumber+" email: "+email;
	}
	

}
