//Author: Roman Ziserman

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class searches through a plugin directory for plugin names. It then gives
 * the user an option to choose a plugin. Once the choice is made, the plugin executes its
 * two functions.
 */
public class PlugItIn {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        File plugin_dir = new File("C:\\Users\\Roman\\Desktop\\plugin");

        //We will search for plugins in plugin_dir and store them in the plugin_list
        ArrayList<Class<?>> plugin_list = new ArrayList<Class<?>>();

        ClassLoader plugin_loader = new PluginLoader();

        //The user must choose a plugin
        Scanner choose_plugin = new Scanner(System.in);
        int user_choice;

        //list the files in the plugin directory
        //search for files which start with plugin
        //put them into a Class array
        for(String c: plugin_dir.list()){
            if(c.contains("Plugin")){
                plugin_list.add(plugin_loader.loadClass(FileNameUtilities.removeExtension(c)));
            }
        }

        //ask the user which plugin they want to load
        int i = 1; //enumerate the list so the user can choose a number
        for(Class<?> c: plugin_list){
            System.out.println(i +". "+ c.getName());
            i++;
        }

        System.out.println("Please choose a plugin:");
        user_choice = choose_plugin.nextInt();

        //load and execute the plugin
        plugin_list.get(user_choice - 1).newInstance();

        choose_plugin.close();
    } //close main()
}
