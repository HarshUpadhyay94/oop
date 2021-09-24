package objectoritentedprogramming;
public class Constructor{

	public String color;
	public int bandwidth;
	
	
	public Constructor() {}
	public Constructor(String a, int b) {
		color=a;
		bandwidth=b;
		
	}
	public static void main(String[] args) {
		Constructor s= new Constructor("yellw", 8);
		System.out.println(s.bandwidth);
		System.out.println(s.color);
	}
	}



