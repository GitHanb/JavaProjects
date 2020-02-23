
public class Rectangle {
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
}
