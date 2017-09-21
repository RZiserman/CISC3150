//Author: Roman Ziserman
import java.util.*;

final public class MyString {
	final private char[] string;
	final private int hash;
	
	//Constructor. Create a copy of 'chars' and store it in the 'string' instance variable.
	public MyString(char[] chars){
		string = Arrays.copyOf(chars, chars.length);
		this.hash = Arrays.hashCode(string);
	}
	
	public char charAt(int index){
		return string[index];
	}
	
	public int length(){
		return string.length;
	}
	
	public MyString substring(int begin, int end){
		return new MyString(Arrays.copyOfRange(string, begin, end));
	}
	
	public MyString toLowerCase(){
		char[] lowerChars = new char[string.length];
		for(int i= 0; i < string.length; i = i +1){
			lowerChars[i] = Character.toLowerCase(string[i]);
		}
		return new MyString(lowerChars);
	}
	
	public MyString toUpperCase(){
		char[] upperChars = new char[string.length];
		for(int i= 0; i < string.length; i = i +1){
			upperChars[i] = Character.toUpperCase(string[i]);
		}
		return new MyString(upperChars);
	}
	
	public boolean equals(MyString s){
		if(this.hash == s.getHash()){
			return true;
		} else {
			return false;
		}
	}
	
	public MyString getMyString(){
		return new MyString(Arrays.copyOf(string, string.length));
	}
	
	public String toString(){
		return new String(Arrays.copyOf(string, string.length));
	}
	
	public static MyString valueOf(int i){
		ArrayList<Character> charList = new ArrayList<Character>();
		int temp = i;
		int remainder = 0;
		int intToCharOffset = 48;
		char[] charArray;
		
		while(temp > 0){
			remainder = (temp%10) + intToCharOffset;
			temp = temp/10;
			charList.add(Character.valueOf((char)remainder));
		}
		
		charArray = new char[charList.size()];
		for(int j=charArray.length-1, k= 0; j >= 0; j= j-1, k = k+1){
			charArray[k] = charList.get(j).charValue();
		}
	
		return new MyString(charArray);
	}
	
	//for testing purposes
	public void printMyString(){
		System.out.println(Arrays.toString(this.string));
	}
	
	//for equals() method
	public int getHash(){
		return this.hash;
	}
}

