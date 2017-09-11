//Author: Roman Ziserman
public class PalindromeDriver {
	public static void main(String[] args){
		//Test contructor 2
		Palindrome pal1 = new Palindrome("Stormtrooper");
		Palindrome pal2 = new Palindrome("kayak");
		
		//Test constructor 1
		Palindrome pal3 = new Palindrome();
		pal3.getPalindromeState();
		Palindrome pal4 = new Palindrome();
		pal4.getPalindromeState();
	}
}

