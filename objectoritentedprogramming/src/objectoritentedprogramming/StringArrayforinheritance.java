package objectoritentedprogramming;

public class StringArrayforinheritance {
	public static void main(String[] args) {
	Testshape[] s=new Testshape[3];
	s[0]=new Testrectangle();
	s[1]=new Testcircle();
	s[2]=new Testtringle();
	double totalArea= CalArea(s);
	System.out.println(totalArea);		
	}
 }
