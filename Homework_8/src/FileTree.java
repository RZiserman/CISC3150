//Author : Roman Ziserman
import java.io.File;

import java.nio.file.Files;

/**The FileTree class contains one static method, printTree with a File array parameter, path_names. Its return type is void.
 * It prints the file tree of each path in path_names with proper indents.
 */

public class FileTree {

    /**The printTree function recursively prints the files and directories for the given File array argument. Each child
     * directory is indented once.
     * @param path_names
     */
    public static void printTree(File[] path_names, int tabCount){
        //inspect each path. Print each abstract pathname. If it's a directory, call printTree on it.
        if(path_names == null){
            return;
        }
        String indents = new String();
        for(int i= 0; i <= tabCount; i++){
            indents = indents + '\t';
        }
        int tabs = tabCount + 1;
        for(File c : path_names){
            System.out.println(indents + c.getName());
            if(c.isDirectory()){
                printTree(c.listFiles(), tabs);
            }
        }
    }

}
