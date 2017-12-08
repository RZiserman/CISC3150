//Author: Roman Ziserman

public class MyPlugin1 extends myplugin {
    static{
        new MyPlugin1().whoSaysHello();
        new MyPlugin1().whoSaysBye();
    }

    @Override
    public void whoSaysHello() {
        System.out.println("MyPlugin1 says hello");
    }

    @Override
    public void whoSaysBye() {
        System.out.println("MyPlugin1 says bye");
    }
}
