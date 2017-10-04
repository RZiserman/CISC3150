//Author: Roman Ziserman
public class MyCircle {
	private int radius;
	
	public MyCircle(int radius){
		this.radius = radius;
	}
	
	public boolean quarterContains(double x, double y){
		if ((x*x + y*y <= radius) && (x<=radius) && (y<=radius)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean contains(double x, double y){
		if ((x*x + y*y <= radius)){
			return true;
		} else {
			return false;
		}
	}
}

