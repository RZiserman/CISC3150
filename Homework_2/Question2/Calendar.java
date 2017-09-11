//Author: Roman Ziserman
import java.util.*;

public class Calendar {
	private int year;
	private int firstOfJan;
	private boolean isLeap;
	private int daysPerMonth[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	private int firstOfMonth[] = new int[12];
	private Month[] months = new Month[12];
	private Scanner userIn;
	
	Calendar(){
		String day;
		userIn = new Scanner(System.in);
		System.out.println("What is the year?");
		year = userIn.nextInt();
		
		System.out.println("Which day does January 1st fall on?");
		day = userIn.next();

		switch(day.toLowerCase()){
		case "monday":
			firstOfJan = 1;
			break;
		case "tuesday":
			firstOfJan = 2;
			break;
		case "wednesday":
			firstOfJan = 3;
			break;
		case "thursday":
			firstOfJan = 4;
			break;
		case "friday":
			firstOfJan = 5;
			break;
		case "saturday":
			firstOfJan = 6;
			break;
		case "sunday":
			firstOfJan = 0;
			break;
		default:
			System.out.println("Check your spelling");
			break;
		}
		
		userIn.close();
		
		//check if leap year
		if ((year%400==0) || (year%4 == 0 && year%100!=0)){
			isLeap = true;
		}
		
		//if it is, change the array element in daysPerMonth which represents February
		if(isLeap){
			daysPerMonth[1] = 29;
		}
		
		//calculate the first day of each month
		firstOfMonth[0] = firstOfJan;
		for(int i=1; i<=11; i=i+1){
			firstOfMonth[i] = (daysPerMonth[i-1]%7 + firstOfMonth[i-1])%7;
		}
	}
	
	public void printCalendar(){
		for(int i=0; i<=11; i=i+1){
			months[i] = new Month(i, daysPerMonth[i], firstOfMonth[i], year);
			months[i].printMonth();
			System.out.println("");
		}
	}
}

