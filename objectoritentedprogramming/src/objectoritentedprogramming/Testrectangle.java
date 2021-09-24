package objectoritentedprogramming;

public class Testrectangle extends Testshape {
	public int length;
	public int width;
	
		public Testrectangle() {}
		

		public Testrectangle (int l, int w) {
			length=l;
			width=w;
		}
		public double area() {
			return width*length;
			}
	}

