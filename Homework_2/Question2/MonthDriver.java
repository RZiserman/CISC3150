//Author: Roman Ziserman
public class MonthDriver {
	public static void main(String[] args){
		Month monthTest = new Month(1, 28, 3, 2002);
		monthTest.printMonth();
		
		Month monthTest2 = new Month(5, 31, 2, 2016);
		monthTest2.printMonth();
		
		Month monthTest3 = new Month(0, 30, 6, 2008);
		monthTest3.printMonth();
	}
}

