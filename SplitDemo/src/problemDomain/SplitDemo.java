package problemDomain;

public class SplitDemo
{
	public static void main(String[] args)
	{
		String str = "one two three four";
		
		String[] tokens = str.split(" ");
		
		for(String s : tokens)
		{
			System.out.println(s);
		}
		
		String str1 = "hanzhongliu1990@gmail.com";
		
		String[] tokens1 = str1.split("[@.]");
		
		for(String s : tokens1)
		{
			System.out.println(s);
		}
	}
}
