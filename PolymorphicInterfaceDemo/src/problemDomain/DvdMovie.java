package problemDomain;

public class DvdMovie implements RetailItem
{
	private String title;
	private int runnningTime;
	private double retailPrice;
	
	public DvdMovie(String title, int runnningTime, double retailPrice)
	{
		super();
		this.title = title;
		this.runnningTime = runnningTime;
		this.retailPrice = retailPrice;
	}

	public String getTitle()
	{
		return title;
	}


	public int getRunnningTime()
	{
		return runnningTime;
	}

	@Override
	public double getRetailPrice()
	{
		return retailPrice;
	}

}
