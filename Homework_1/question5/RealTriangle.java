//Program by Roman Ziserman
import java.util.*;

public class RealTriangle {
	String triangleName;
	double pointA;
	double pointB;
	double pointC;
	boolean isTriangle;
	Scanner userIn;
	
	void setName(){
		userIn = new Scanner(System.in);
		System.out.println("Give your triangle a name:");
		triangleName = userIn.nextLine();
		
	}
	void getName(){
		System.out.println("The triangle's name is" + triangleName);
	}
	void setPts(){
		
		System.out.println("Enter point A");
		pointA = userIn.nextDouble();
		System.out.println("Enter point B");
		pointB = userIn.nextDouble();
		System.out.println("Enter point C");
		pointC = userIn.nextDouble();
		userIn.close();
	}
	void getPts(){
		System.out.println("Point A:" + pointA +" Point B:" + pointB + " Point C:" + pointC);
	}
	void triangleTest(){
		if ((pointA+pointB>=pointC) && (pointA+pointC>=pointB) && (pointB+pointC>=pointA)){
			isTriangle=true;
		}
		else {
			isTriangle=false;
		}
	}
	void getTriangleStatus(){
		if(isTriangle == true){
			System.out.println(triangleName + " is a triangle!");
		}
		else{
			System.out.println(triangleName + " is not a triangle");
		}
	}
}

