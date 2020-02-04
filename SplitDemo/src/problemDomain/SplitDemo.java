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
	}
}
