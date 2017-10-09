//Author: Roman Ziserman
package ChildPackage;
import ParentPackage.Parent;
import java.util.*;

public class ChildDriver {
    public static void main(String[] args){
        int babbyAmt;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Number of babbys?");
        babbyAmt=userIn.nextInt();

        //Use polymorphism with declared superclass type 'Parent' and object subclass type 'Child'
        Parent papa = new Child(babbyAmt);
        //Cast Parent type to Child to access Child's getBabby() method
        ((Child)papa).getBabby();
        userIn.close();
    }
}

