import java.io.File;

public class FileTreeDriver {
    public static void main(String[] args) {
       File[] fileArray = new File[]{new File("/home/rziserman/CISC3150_HW")};
			 FileTree.printTree(fileArray, 0);
    }
}
