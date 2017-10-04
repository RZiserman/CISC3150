//Author: Roman Ziserman
public class PointContainmentDriver{
	public static void main(String[] args) {
		long numberOfPoints = 4000000000L;
		int radius = 1;
		int side = 1;
		PointContainment monteCarlo = new PointContainment(numberOfPoints, radius, side);
		monteCarlo.calculateRatio();
	}
}

