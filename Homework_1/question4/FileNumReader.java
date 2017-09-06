//Program by Roman Ziserman
//Source 1:  https://stackoverflow.com/questions/19697922/run-java-program-by-giving-it-input-using-file-redirection, user Chris Hayes.
//Source 2: Scanner API

import java.util.*;

public class FileNumReader{
	public static void main(String [] args){
		Scanner fileScan = new Scanner(System.in); 

		//Redirect input from the file. Print until EOF is reached.
		//the nextLine() method positions the scanner past the current line. If print is used instead of println
		//files which contain new lines are printed as a continuous string.
		while(fileScan.hasNext()){
			System.out.println(fileScan.nextLine());
		}
	}
}
