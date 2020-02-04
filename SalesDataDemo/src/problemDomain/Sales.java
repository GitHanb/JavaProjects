/**
 * 
 */
package problemDomain;

import javax.swing.JOptionPane;

/**
 * @author henryhan
 *
 */
public class Sales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int ONE_WEEK = 7;
		
		double[] sales = new double[ONE_WEEK];
		
		getValues(sales);
		
		SalesData week = new SalesData(sales);
		
		JOptionPane.showMessageDialog(null, String.format("The total sales were $%,.2f\n"
				+ "The average sales were $%,.2f\n"
				+ "The highst sales were $%,.2f\n"
				+ "The lowest sales were $%,.2f\n", 
				week.getTotal(), week.getAverage(), week.getHighest(), week.getLowest()));

	}
	
	private static void getValues(double[] array) {
		String input;
		for(int i=0; i<array.length; i++) {
			input = JOptionPane.showInputDialog("Enter the sales for day " + (i+1) + ".");
			array[i] = Double.parseDouble(input);
		}
	}

}
