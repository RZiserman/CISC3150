//Author: Roman Ziserman

import java.util.*;

public class NumberPyramid {
	private int height;

	NumberPyramid() {
		Scanner userIn = new Scanner(System.in);

		System.out.print("What is the height of the pyramid?:");
		height = userIn.nextInt();

		userIn.close();
	}

	public void printPyramid() {
		for (int i = 1; i <= height; i = i + 1) {
			System.out.println("");

			// loop for spacing
			for (int space = 1; space <= 2 * (height - i); space = space + 1) {
				System.out.print(" ");
			}
			// loop for ascending numbers
			for (int j = 1; j <= i; j = j + 1) {
				System.out.printf("%2d", j);
			}
			// loop for descending numbers
			for (int k = i - 1; k >= 1; k = k - 1) {
				System.out.printf("%2d", k);
			}
		}
		System.out.print('\n');

	}
}

/*Note: The "smooshing" of the two-digit numbers is intentional. I wanted to maintain the pyramid 
 structure as much as possible. I chose to maintain the two-space wide field for each number, 
 instead of expanding it to three spaces when the 2 digit numbers start occurring.  
*/
