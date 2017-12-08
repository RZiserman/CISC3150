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

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        File plugin_dir = new File("C:\\Users\\Roman\\Desktop\\plugin");

        //We will search for plugins in plugin_dir and store them in the plguin_list
        ArrayList<File> plugin_list = new ArrayList<File>();

        ClassLoader plugin_loader = new PluginLoader();
        Class new_plugin;

        //The user must choose a plugin
        Scanner choose_plugin = new Scanner(System.in);
        int user_choice;
        String chosen_plugin_name;

        //list the files in the plugin directory
        //search for files which start with plugin
        //put them into a File array
        for(String c: plugin_dir.list()){
            if(c.contains("Plugin")){
                plugin_list.add(new File(c));
            }
        }

        //ask the user which plugin they want to load
        int i = 1; //enumerate the list so the user can choose a number
        for(File c: plugin_list){
            System.out.println(i +". "+ c.getName());
            i++;
        }

        System.out.println("Please choose a plugin:");
        user_choice = choose_plugin.nextInt();

        //load and execute the plugin
        try {
            chosen_plugin_name = FileNameUtilites.removeExtension(plugin_list.get(user_choice - 1).getName());
            new_plugin = plugin_loader.loadClass(chosen_plugin_name);
            new_plugin.newInstance();
        } catch (ClassNotFoundException e){
            System.out.println("Class does not exist");
            e.printStackTrace();
        }
        choose_plugin.close();
    } //close main()1
}
