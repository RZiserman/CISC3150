//Author: Roman Ziserman
import java.util.*;
public class Palindrome {
	private String userString;
	private boolean isPalindrome = true;
	
	//constructor 1
	Palindrome(){
		userString = new String();
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter your string");
		userString = userIn.next();
		
		for(int i=0;i<userString.length()/2; i=i+1){
			if (userString.charAt(i)!=userString.charAt((userString.length()-1)-i)){
				isPalindrome = false;
				break;
			}
		}
		//userIn.close(); 
		//cannot close since this closes System.in
	}
	
	//constructor 2
	Palindrome(String userString){
		this.userString = userString;
		for(int i=0;i<userString.length()/2; i=i+1){
			if (userString.charAt(i)!=userString.charAt((userString.length()-1)-i)){
				isPalindrome = false;
				break;
			}
		}
		this.getPalindromeState();
	}
	
	public void getPalindromeState(){
		if(isPalindrome){
			System.out.println(userString + " is a palindrome!");
		} else {
			System.out.println(userString + " is not a palindrome!");
		}
	}
}

