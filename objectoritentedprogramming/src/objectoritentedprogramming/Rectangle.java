package objectoritentedprogramming;

public class Rectangle {
	public int length;
	public int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		return length*width;
		}
	

	public static void main(String[] args) {
		Rectangle c=new Rectangle();
		c.setLength(10);
		c.setWidth(10);
		System.out.println(c.area());

	}
}
