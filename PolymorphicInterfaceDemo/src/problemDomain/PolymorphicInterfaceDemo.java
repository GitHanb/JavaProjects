package problemDomain;

public class PolymorphicInterfaceDemo
{

	public static void main(String[] args)
	{
		CompactDisc cd = new CompactDisc("Born this way", "Lady Gaga", 29.99);
		
		DvdMovie movie = new DvdMovie("Final Destination", 90, 12.99);
		
		System.out.println("Item #1: " + cd.getTitle());
		showPrice(cd);
		
		System.out.println("Item #2: " + movie.getTitle());
		showPrice(movie);

	}
	
	private static void showPrice(RetailItem item)
	{
		System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
	}

}
