import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("SerializableObjects.ser");
            ObjectInputStream objInStream = new ObjectInputStream(fileInputStream);

            Object one = objInStream.readObject();
            Object two = objInStream.readObject();
            Object three = objInStream.readObject();

            SerializableClass readObjOne = (SerializableClass) one;
            SerializableClass readObjTwo = (SerializableClass) two;
            SerializableClass readObjThree = (SerializableClass) three;

            objInStream.close();

            System.out.println("After reading object one: staticInt contains:" + SerializableClass.getStaticInt());
            System.out.println("readObjOne.nonStaticInt contains: " + readObjOne.getNonStaticInt());
            System.out.println("readObjOne.transientInt contains: " + readObjOne.getTransientInt());

            System.out.println();
            System.out.println("After reading object two: staticInt contains:" + SerializableClass.getStaticInt());
            System.out.println("readObjTwo.nonStaticInt contains: " + readObjTwo.getNonStaticInt());
            System.out.println("readObjTwo.transientInt contains: " + readObjTwo.getTransientInt());

            System.out.println();
            System.out.println("After reading object three: staticInt contains:" + SerializableClass.getStaticInt());
            System.out.println("readObjThree.nonStaticInt contains: " + readObjThree.getNonStaticInt());
            System.out.println("readObjThree.transientInt contains: " + readObjThree.getTransientInt());

        } catch (IOException e){
            System.out.println("File does not exist.");
        } catch (ClassNotFoundException e){
            System.out.println("Class 'SerializableClass' not found.");
        }
    }
}
