package Project;
import java.util.*;

public class ContactManager {
	Scanner sc = new Scanner(System.in);
	
	List<Contact> contacts = new ArrayList<Contact>();
	
	public void addContact(Contact contact)
	{
		for(Contact c:contacts)
		{
			if(c.getPhoneNumber().equalsIgnoreCase(contact.getPhoneNumber()))
			{
				System.out.println("Contact already saved");
				return;
			}
		}
			contacts.add(contact);
		
	}
	
	public void searchByName(String name)
	{
		for(Contact c:contacts)
		{
			if(c.getName().equalsIgnoreCase(name))
			{
				System.out.println("Contact Found. Details as below");
				System.out.println(c);
				return;
			}
		}
		
		System.out.println("Contact not Found");
	}
	
	public void searchByNumber(String number)
	{
		for(Contact c:contacts)
		{
			if(c.getPhoneNumber().equalsIgnoreCase(number))
			{
				System.out.println("Contact Found. Details as below");
				System.out.println(c);
				return;
			}
		}
		System.out.println("Contact not Found");
	}
	
	public void deleteById(int id)
	{
		for(Contact c:contacts)
		{
			if(c.getId()==id)
			{
				contacts.remove(c);
				System.out.println("Contact removed successfully");
				return;
			}
		}
		System.out.println("Contact not found");
	}
	
	public void updateContact()
	{
		Contact var = null;
		int n;
		System.out.println("Enter the contact id you want to update");
		try
		{
		n=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter an integer value");
			n=sc.nextInt();
		}
		
		for(Contact c:contacts)
		{
			if(c.getId()==n)
			{
				var=c;
				System.out.println("Enter the new name,phonenumber,email");
			    String name=sc.next();
			    String phoneNumber = sc.next();
			    String email=sc.next();
			    var.setName(name);
			    var.setPhoneNumber(phoneNumber);
			    var.setEmail(email);
			    System.out.println("Contact Updated Succesfully");
			    System.out.println(var);
				return;
			}
		}
		System.out.println("No contact found");
		
		
	}
	

}
