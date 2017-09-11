//Author: Roman Ziserman
import java.util.*;

public class ChangeDelimiter {
	private Scanner userIn;
	private String userString;

	public void commaTokenize() {
		userIn = new Scanner(System.in);
		userIn.useDelimiter(",");

		System.out.println("Enter a string seperated by commas: ");
		while (userIn.hasNext()) {
			System.out.println(userIn.next());
		}

	}

}

