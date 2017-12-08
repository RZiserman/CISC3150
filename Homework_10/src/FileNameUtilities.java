//Author: Roman Ziserman

public class FileNameUtilities {
    public static String removeExtension(String path_name){
        int dot_index = path_name.indexOf('.');
        return path_name.substring(0,(dot_index));
    } //close removeExtension()
}
