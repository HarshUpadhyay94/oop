package objectoritentedprogramming;



public class Constructorr {
	public String color;
	public int bandwidth;
	
	public Constructorr() {}
	
	public Constructorr(String a, int b) {
		this.color=a;
		this.bandwidth=b;
	}
		
		
		public static void main(String[] args) {
		Constructorr ss=new Constructorr("red", 6);
			
		
		System.out.println(ss.bandwidth);
		System.out.println(ss.color);
		}			
}

