package problemDomain;

public class SalesData {
	private double[] sales;
	
	//constructor 
	public SalesData(double[] s) {
		sales = new double[s.length];
		
		for(int i=0; i<s.length; i++) {
			sales[i] = s[i];
		}
	}
	
	public double getTotal(){
		double total = 0.0;
		
		for(int i=0; i<sales.length; i++) {
			total += sales[i];
		}
		return total;

	}
	
	public double getAverage() {
		return getTotal() / sales.length;
	}
	
	public double getHighest() {
		double highest = sales[0];
		for(int i=0; i<sales.length; i++) {
			if(sales[i] > highest) {
				highest = sales[i];
			}
		}
		return highest;
	}
	
	public double getLowest() {
		double lowest = sales[0];
		for(int i=0; i<sales.length; i++) {
			if(sales[i] < lowest) {
				lowest = sales[i];
			}
		}
		return lowest;
	}
	
}
