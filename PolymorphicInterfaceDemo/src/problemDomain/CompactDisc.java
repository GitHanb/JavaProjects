package problemDomain;

public class CompactDisc implements RetailItem
{
	private String title;
	private String artist;
	private double retailPrice;
	
	public CompactDisc(String title, String artist, double retailPrice)
	{
		this.title = title;
		this.artist = artist;
		this.retailPrice = retailPrice;
	}	

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	@Override
	public double getRetailPrice()
	{
		return retailPrice;
	}

}
