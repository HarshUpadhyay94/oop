package objectoritentedprogramming;

public class Testtringle extends Testshape {
	public int height;
	public int base;
	
	public Testtringle() {}
	public Testtringle(int h , int b) {
		height=h;
		base=b;
	}
	public double area() {
	return 0.5*height*base; 
}
}