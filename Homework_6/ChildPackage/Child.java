//Author: Roman Ziserman
package ChildPackage;
import ParentPackage.Parent;

public class Child extends Parent {
    //babby instance variable is inherited from Parent class

    //invoke the super constructor and initialize Child's Parent with i
    public Child(int i) {
        super(i);
    }

    //Print the amount of babbys
    public void getBabby() {
        System.out.println(super.babby + " babbys have been formed.");
    }
}

