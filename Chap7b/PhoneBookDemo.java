// PhoneBookDemo.java
// Bryan Ramirez
// April 12, 19

import java.util.ArrayList;


public class PhoneBookDemo
{
	public static void main(String[] args) 
	{
		ArrayList<PhoneBookEntry> phoneBookList = new ArrayList<>();
		phoneBookList.add(new PhoneBookEntry("Belle", "555-1234"));
		phoneBookList.add(new PhoneBookEntry("Buster", "555-4789"));
		phoneBookList.add(new PhoneBookEntry("Elektra", "555-4569"));
		phoneBookList.add(new PhoneBookEntry("Chester", "555-8282"));
		phoneBookList.add(new PhoneBookEntry("Sammy", "555-9854"));
		displayPhoneBook(phoneBookList);

	}

	
	public static void displayPhoneBook(ArrayList<PhoneBookEntry> phoneBook)
	{
		System.out.println("My Phone Book: ");
		
		for (int index = 0; index < phoneBook.size(); index++)
		{
			System.out.println("-----------------------------------------");
			PhoneBookEntry contact = (PhoneBookEntry)phoneBook.get(index);
			System.out.println("Name: " + contact.getName() + "\n" + "Phone Number: " + contact.getPhoneNum());
		}
	}

}
