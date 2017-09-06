//Program by Roman Ziserman

public class MonthName{
	//String array of months
	String[] months = {"January", "February", "March", "April", "May", "June",
	"July", "August", "September", "October", "November", "December"};
	
	//generates random number between 1 and 12
	int generateRandMonthNum(){
		return (int)(Math.random()*10)%13;
	}
	
	//prints the name of the month based on number generated
	void getName(int num){
  	System.out.println(months[num]);
	}
}
