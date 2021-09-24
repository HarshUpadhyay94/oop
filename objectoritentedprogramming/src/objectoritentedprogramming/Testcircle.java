package objectoritentedprogramming;

public class Testcircle extends Testshape {
	public Testcircle() {}
	public double radius;

	public Testcircle(int r) {
		radius=r;
	}
	public double area() {
		return 3.14*radius*radius;
		
		}
}
