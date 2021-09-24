package objectoritentedprogramming;

public class Automoblie {

	private String color;
	private double speed;
	private String make;
	
	public static final int NO_OF_GEARS = 0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void Break (int a) {
		
		if(speed==a) {
			System.out.println("car stoped");
			}else {
			System.out.println("car is running");
		}
	}
		public void Accelaration(int aa) {
			if (speed>aa) {
		System.out.println("Stop Accelararion");
			}else if(speed<aa) {
		System.out.println("Accelarate your car");
			}else{
		System.out.println("Maintain accelaration");
				
			}
		}
	}	
	












