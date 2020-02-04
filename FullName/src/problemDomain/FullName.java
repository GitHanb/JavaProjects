package problemDomain;

public class FullName
{
	private String lastName;
	private String firstName;
	private String middleName;
	
	public FullName()
	{
		this.lastName = "";
		this.firstName = "";
		this.middleName = "";
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	public int getLength()
	{
		return lastName.length() + firstName.length() + middleName.length();
	}
	
	public String toString()
	{
		return firstName + " " + middleName + " " + lastName;
	}

}
