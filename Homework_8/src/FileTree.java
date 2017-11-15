/**
 *@author Roman Ziserman
 *The FileTree class contains one static method, printTree with a 1) File array parameter - path_names, 2) an integer
 *paremeter - indent_count, and 3)a BufferedWriter - writer. The parameter 'indent_count' is used to keep track of the
 * indentations as we recurse down the tree. Writer creates a file to store the tree,This method returns void. It prints
 * the directory tree of each path in path_names with proper indentations.
 */
import java.io.*;

public class FileTree {

    /**
     * The printTree function recursively prints directories for the given File array argument. Each child
     * directory is indented once.
     * @param path_names
     * @param indent_count
     * @param writer
     * @throws IOException
     */
    public static void printTree(File[] path_names, int indent_count, BufferedWriter writer) throws IOException{
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

        //Recurse for each directory. Write each directory to file provided.
        for(File c : path_names){
            if(c.isDirectory()){
                writer.write(indents + c.getName());
                writer.newLine();
                printTree(c.listFiles(), new_indent_count, writer);
            }
        }
    }
}
