package objectoritentedprogramming;

public class Tringle extends Shape {
public int base;
public int height;
public double area;
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
    public double ttarea() {
	  return 0.5*base*height;
}
public static void main (String[] args) {
	Tringle s= new Tringle();
	s.setBase(9);
	s.setHeight(5);
	s.setColor("red");
	System.out.println(s.ttarea());
	System.out.println(s.getColor());
	
	
	
	
	
	
	
}

}
