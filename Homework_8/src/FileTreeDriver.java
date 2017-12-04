//Author : Roman Ziserman
/*
 Create a file dir_tree.txt. Put in directory or directories of choice into the the printTree function.
*/

import java.io.*;

public class FileTreeDriver {
    public static void main(String[] args) {
       try{
       		BufferedWriter dir_tree = new BufferedWriter(new FileWriter("dir_tree.txt"));
	        File[] fileArray = new File[]{new File("/home/rziserman/CISC3150_HW")};
       		FileTree.printTree(fileArray, 0, dir_tree);        
       } catch (IOException e){
		System.err.println("No such file");
       }
    }
}
