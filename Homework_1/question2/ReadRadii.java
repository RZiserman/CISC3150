//Program by Roman Ziserman
//Reference Scanner API

import java.util.*;

public class ReadRadii {
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		//Try and catch block for wrong type exception and EOF
		try {
			do {
				System.out.println("Enter a radius: ");
				double userArea = userIn.nextDouble();
				System.out.println("The area is " + area(userArea));
			} while (userIn.hasNext());
		} catch (InputMismatchException io) {
			System.out.println("Wrong type!");
		} catch (NoSuchElementException ex) {
			System.out.println("EOF");
		}
	}

	static double area(double x) {
		return Math.PI*Math.pow(x, 2);
	}
}


