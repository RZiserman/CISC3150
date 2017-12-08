//Author: Roman Ziserman

public class MyPlugin2 extends myplugin {
    static {
        new MyPlugin2().whoSaysHello();
        new MyPlugin2().whoSaysBye();
    }
    @Override
    public void whoSaysHello() {
        System.out.println("MyPlugin2 says hello");
    }

    @Override
    public void whoSaysBye() {
        System.out.println("MyPlugin2 says bye");
    }
}
