//Author: Roman Ziserman
package ParentPackage;

public class Parent {

    protected int babby;

    public Parent (){
        System.out.println("How is babby formed?");
    }
    public Parent(int babby){
        this();
        this.babby = babby;
    }
}

