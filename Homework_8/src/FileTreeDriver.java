import java.io.File;

public class FileTreeDriver {
    public static void main(String[] args) {
        FileTree.printTree(File.listRoots());
    }
}
