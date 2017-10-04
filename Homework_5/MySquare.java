//Author: Roman Ziserman
public class MySquare {
	int side;
	
	public MySquare(int side){
		this.side = side;
	}
	
	public boolean contains(double x, double y){
		if(x<=side && y<=side){
			return true;
		} else {
			return false;
		}
	}
}

