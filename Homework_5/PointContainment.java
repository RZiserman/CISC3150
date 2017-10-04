//Author: Roman Ziserman
import java.util.*;
public class PointContainment {
	private MyCircle circle;
	private MySquare square;
	private Random rndInt;
	private double x;
	private double y;
	private double numOfPts;
	private double pointsInCircle;
	private double pointsInSquare;
	
	public PointContainment(long numOfPts, int radius, int squareSide){
		this.numOfPts = numOfPts;
		circle = new MyCircle(radius);
		square = new MySquare(squareSide);
		rndInt = new Random();
	}
	
	public void calculateRatio(){
		int quadrants = 4;
		for (long i=0L; i < numOfPts; i++){
			x = rndInt.nextDouble();
			y = rndInt.nextDouble();
			if (circle.quarterContains(x, y)){
				pointsInCircle++;
			}
			if (square.contains(x, y)){
				pointsInSquare++;
			}
		}
		System.out.println("The ratio is: " + (double)pointsInCircle/pointsInSquare*quadrants);
	}
}

