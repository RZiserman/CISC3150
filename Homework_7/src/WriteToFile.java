import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        SerializableClass objOne = new SerializableClass(1, -1);
        SerializableClass objTwo = new SerializableClass(2, -2);
        SerializableClass objThree = new SerializableClass(3,-3);

        try {
            FileOutputStream outFileStream = new FileOutputStream("SerializableObjects.ser");
            ObjectOutputStream ObjOutStream = new ObjectOutputStream(outFileStream);

            ObjOutStream.writeObject(objOne);
            ObjOutStream.writeObject(objTwo);
            ObjOutStream.writeObject(objThree);

            ObjOutStream.close();

        } catch (FileNotFoundException e){
            System.out.println("That file does not exist");
        } catch (IOException e){
            System.out.println("Smething wrong with the object output stream.");
        }
    }
}
