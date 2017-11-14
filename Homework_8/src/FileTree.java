//Author : Roman Ziserman
import java.io.File;

/**The FileTree class contains one static method, printTree with a 1) File array parameter - path_names, and 2) an integer 
 *paremeter - indent_count. The parameter 'indent_count' is used to keep track of the indentations as we recurse down the tree.  
 *This method returns void. It prints the directory tree of each path in path_names with proper indentations.
 */

public class FileTree {

    /**The printTree function recursively prints the files and directories for the given File array argument. Each child
     * directory is indented once.
     * @param path_names
     */
    public static void printTree(File[] path_names, int indent_count){
        //inspect each path. If it's null, return to the previous stack frame. If it's a directory, call printTree on it.
        if(path_names == null){
            return;
        }
        
	//Add an indentation for each directory
	String indents = new String();
        for(int i= 0; i <= indent_count; i++){
            indents = indents + "  ";
        }
        int new_indent_count = indent_count + 1;
	
	//Recurse for each directory.
	for(File c : path_names){
 		if(c.isDirectory()){
			System.out.println(indents + c.getName());
                	printTree(c.listFiles(), new_indent_count);
            }
        }
    }
}
