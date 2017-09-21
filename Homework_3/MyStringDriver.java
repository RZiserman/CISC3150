//Author: Roman Ziserman
public class MyStringDriver {
	public static void main(String[] args){
		char[] charArray1 = {'a','B','c','D','e','F', 'g','h'};
		char[] charArray2 = {'a','B','c','D','e','F', 'g','h'};
		char[] charArray3 = {'a','D','c','D','e','G', 'g','2'};
		
		
		MyString mainString = new MyString(charArray1);
		MyString getStringTest = mainString.getMyString();
		MyString equalTest1 = new MyString(charArray2);
		MyString equalTest2 = new MyString(charArray3);
		MyString subString = mainString.substring(3, 6);
		MyString lowerCase = mainString.toLowerCase();
		MyString upperCase = mainString.toUpperCase();
		MyString integer = MyString.valueOf(58212964);
		String toStringTest = mainString.toString();
		
		System.out.println("1. constructor test: ");
		mainString.printMyString();
		
		System.out.println("2. substring() method test: ");
		subString.printMyString();
		
		System.out.println("3. lowerCase() method test: ");
		lowerCase.printMyString();
		
		System.out.println("4. upperCase() method test: ");
		upperCase.printMyString();
		
		System.out.println("5. equals() method test 1: ");
		System.out.println(mainString.equals(equalTest1));
		
		System.out.println("6. equals() method test 2: ");
		System.out.println(mainString.equals(equalTest2));
		
		System.out.println("7. valueOf(int) method test: ");
		integer.printMyString();
		
		System.out.println("8. toString() method test: ");
		System.out.println(toStringTest);
		
		System.out.println("9. getString() method test: ");
		getStringTest.printMyString();
		
		System.out.println("10. charAt() and length() method test: ");
		for(int i=0; i<mainString.length(); i = i+1){
			System.out.println("Character at index " +i + " is: " + mainString.charAt(i));
		}
		
		System.out.println("Tests complete.");
		
	}
}

