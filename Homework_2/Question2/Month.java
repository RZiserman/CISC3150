//Author: Roman Ziserman
public class Month {
	private int daysInMonth;
	private int year;
	private String monthName;
	private int firstOfMonth;
	private String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September"
			,"October", "November", "December"};
	
	Month(int month, int daysInMonth, int firstOfMonth, int year){
		this.daysInMonth = daysInMonth;
		this.firstOfMonth = firstOfMonth;
		monthName = monthNames[month];
		this.year = year;
	}
	
	public void getDays(){
		System.out.println("The number of days in the month is: " + daysInMonth);
	}
	
	public void getYear(){
		System.out.println("The year is: " + year);
	}
	
	public void getFirstOfMonth(){
		System.out.println("The first of the month is: " + firstOfMonth);
	}
	
	public void getMonthName(){
		System.out.println("The month name is: " + monthName);
	}
	
	public void printMonth(){
		String format = "%3d";
		//the following string will be formatted into a calendar
		String monthString = new String();
		//the following int will determine the number of rows in the calendar
		int calRows;
		String daysOfWeek = " Su Mo Tu We Th Fr Sa";
		
		//loop for determining the spacing on the first row of the calendar
		for(int i=0; i<firstOfMonth; i=i+1){
			monthString = monthString + "   ";
		}
		//loop will add the actual dates to the calendar [range 1 to 31]
		for(int i=1; i<=daysInMonth; i=i+1){
			monthString = monthString + monthString.format(format, i);
		}
		
		//each row is 21 characters wide
		calRows = monthString.length()/21;
		
		System.out.println("     " + monthName + " " + year);
		System.out.println(daysOfWeek);
		
		//format the calendar into proper rows
		for(int i = 0; i <calRows; i = i+1){
			System.out.println(monthString.substring(i*21, (i+1)*21 ));
		}
		
		//for the case where day 31 is a Sunday
		if (monthString.length() - calRows*21 !=0){
			System.out.println(monthString.substring(calRows*21, monthString.length()));
		}	
	}
}
