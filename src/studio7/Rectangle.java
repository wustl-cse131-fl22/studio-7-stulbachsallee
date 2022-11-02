package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() {
		return this.width*this.length;
	}
	
	public double getPerimeter() {
		return (2 * this.width) + (2 * this.length);
	}
		
	public boolean isSmaller(Rectangle other) {
		if (other.getArea() > this.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare(){
		if(this.width == this.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
/*	public String toString() {
		return
	}*/
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3, 4);
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
		Rectangle rect2 = new Rectangle(2, 2);
		System.out.println(rect2.isSquare());
		System.out.println(rect.isSmaller(rect2));
		
	}

}
