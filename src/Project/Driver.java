package Project;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=0,id;
		String name,phoneNumber,email;
		ContactManager cm = new ContactManager();

		while (true) {
			System.out.println(
					"Enter 1 to add contact\nEnter 2 to searchByName\nEnter 3 to searchByNumber\nEnter 4 to deleteById\nEnter 5 to updateContact\nEnter 6 to exit");
			try {
				n = sc.nextInt();
			} catch (Exception e) {
				sc.next();
				System.out.println("Enter an integer");
				n = sc.nextInt();
			}

			switch (n) {
			case 1: {
				System.out.println("Enter id,name,phonenumber,email");
				try
				{
					id=sc.nextInt();
					name=sc.next();
					phoneNumber=sc.next();
					email=sc.next();
					
				}
				catch(Exception e)
				{
					System.out.println("Enter details Correctly");
					try
					{
					id=sc.nextInt();
					}
					catch(Exception exp)
					{
						sc.next();
						System.out.println("Enter a proper integer");
						id=sc.nextInt();
					}
					name=sc.next();
					phoneNumber=sc.next();
					email=sc.next();
				}
				try
				{
					long na = Long.parseLong(name);
				}
				catch(Exception e)
				{
					
				}
				System.out.println("Enter a proper name, only digits not allowed");
				name=sc.next();
				try
				{
					long l = Long.parseLong(phoneNumber);
				}
				catch(Exception e)
				{
					System.out.println("Only digits allowed in phone number");
					phoneNumber="12";
				}
				
				while(phoneNumber.length()!=10)
				{
					System.out.println("Enter a 10 digit phone number");
					phoneNumber=sc.next();
					try
					{
						long l = Long.parseLong(phoneNumber);
					}
					catch(Exception e)
					{
						System.out.println("Only digits allowed in phone number");
						phoneNumber="12";
						continue;
					}
				}
				
				while(!email.contains("@"))
				{
					System.out.println("Enter a proper email id");
					email=sc.next();
				}
				
				Contact c = new Contact(id,phoneNumber,name,email);
				cm.addContact(c);
				break;
			}
			
			case 2:
			{
				System.out.println("Enter name");
				name=sc.next();
				cm.searchByName(name);
				break;
			}
			case 3:
			{
				System.out.println("Enter number");
				phoneNumber=sc.next();
				cm.searchByNumber(phoneNumber);
				break;
			}
			case 4:
			{
				System.out.println("Enter id");
				try {
				id =sc.nextInt();
				}
				catch(Exception e)
				{
					sc.next();
					System.out.println("Enter an integer");
					id=sc.nextInt();
					
				}
				cm.deleteById(id);
				break;
			}
			case 5:
			{
				cm.updateContact();
				break;
			}
			case 6:
				System.exit(0);

			}
		}
	}

}
