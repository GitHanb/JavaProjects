package problemDomain;

public class SplitDemo
{
	public static void main(String[] args)
	{
		//1st example
		String str = "one two three four";
		//trim space
		str = str.trim();
		
		String[] tokens = str.split(" ");
		
		for(String s : tokens)
		{
			System.out.println(s);
		}
		
		//2nd example
		String str1 = "hanzhongliu1990@gmail.com";
		
		str1 = str1.trim();
		
		String[] tokens1 = str1.split("[@.]");
		
		for(String s : tokens1)
		{
			System.out.println(s);
		}
	}
}
