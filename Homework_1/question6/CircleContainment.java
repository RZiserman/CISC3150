//Program by Roman Ziserman

import java.awt.geom.*;
import java.util.*;

public class CircleContainment {
   Point2D.Double pointOne = new Point2D.Double();
   Point2D.Double pointTwo = new Point2D.Double();
   double radiusOne;
   double radiusTwo;
   double distBetPoints;
   boolean totalOverlap = false;
   boolean partOverlap = false;
   boolean touch = false;
   Scanner userIn;
   
   void setCircleParameters(){
	   //variables to hold coordinate
	   double x;
	   double y;
	   
	   //get information for first circle
	   userIn = new Scanner(System.in);
	   System.out.println("Please enter the radius of the first circle");
	   radiusOne = userIn.nextDouble();
	   System.out.println("Please enter the x coordinate of the first center");
	   x = userIn.nextDouble();
	   System.out.println("Please enter the y coordinate of the first center");
	   y = userIn.nextDouble();
	   pointOne.setLocation(x, y);
	   
	   //get information for second circle
	   System.out.println("Please enter the radius of the second circle");
	   radiusTwo = userIn.nextDouble();
	   System.out.println("Please enter the x coordinate of the second center");
	   x = userIn.nextDouble();
	   System.out.println("Please enter the y coordinate of the second center");
	   y = userIn.nextDouble();
	   pointTwo.setLocation(x, y);
	   
	   //close scanner
	   userIn.close(); 
	   
	   //set instance variables
	   distBetPoints = pointOne.distance(pointTwo);
   }
   
   void setFlags(){
	   double bigRad;
	   double smallRad;
	   
	   //if all the parameters are the same, the circles clearly overlap
	   if (radiusOne == radiusTwo && pointOne.equals(pointTwo)){
		   totalOverlap = true;
		   partOverlap = true;
		   touch = true;
		   return;
	   }
	   
	   //Determine which circle is bigger
	   if(radiusOne > radiusTwo){
		   bigRad = radiusOne;
		   smallRad = radiusTwo;
	   } else {
		   bigRad = radiusTwo;
		   smallRad = radiusOne;
	   }
	   
	   //if the distance between the centers equals the length of the combined radii, then the circles touch
	   if (bigRad + smallRad == distBetPoints){
		   touch = true;
	   }
	   
	   //if the distance of the combined radii is bigger than the distance between the centers, the circles intersect
	   if (bigRad + smallRad > distBetPoints){
		   partOverlap = true;
	   }
	   
	   //Test if center of one circle is inside the other circle
	   if (distBetPoints <= bigRad){
		   //this formula determines if the smaller circle is contained in the bigger circle (draw a picture for more clarity)
		   if((bigRad-distBetPoints) >= smallRad){
			   totalOverlap = true;
		   }
	   }
   }
   
   void containmentStatus(){
	   if(totalOverlap){
		   System.out.println("One circle contains the other");
	   }else if (partOverlap){
		   System.out.println("The circles partially overlap");
	   } else if (touch){
		   System.out.println("The circles touch");
	   } else {
		   System.out.println("The circles don't intersect");
	   }
   }
}

