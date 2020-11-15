// PhoneBookEntry.java
// Bryan Ramirez
// April 12, 2019


public class PhoneBookEntry 
{
	private String name;
	private String phoneNum;
	
	public PhoneBookEntry(String name, String phoneNum)
	{
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhoneNum() 
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) 
	{
		this.phoneNum = phoneNum;
	}

	
}
