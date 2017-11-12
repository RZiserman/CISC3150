//Author : Roman Ziserman
import java.io.File;

import java.nio.file.Files;

/**The FileTree class contains one static method, printTree with a String array parameter, path_names. Its return type is void.
 * It prints the file tree of each path in path_names with proper indents.
 */

public class FileTree {

    /**The printTree function recursively prints the files and directories for the given String array argument. Each child
     * directory is indented once.
     * @param path_names
     */
    public static void printTree(String[] path_names){
        //inspect each path. Print each abstract pathname. If it's a directory, recurse.
        for(String c : path_names){
            System.out.println("\t" + c);
            File path = new File(c);
            if(path.isDirectory()){
                printTree(path.list());
            }
        }
    }

    //Overloaded printTree method for working with host system's root directories.
    public static void printTree(File[] roots){
        for(File c: roots){
            printTree(c.list());
        }
    }
}
