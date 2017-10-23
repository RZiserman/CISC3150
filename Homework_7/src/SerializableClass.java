import java.io.Serializable;

public class SerializableClass implements Serializable {
    private static int staticInt;
    private int nonStaticInt;
    private transient int transientInt;

    public SerializableClass(int nonStaticInt, int transientInt){
        staticInt = staticInt + 1;
        this.nonStaticInt = nonStaticInt;
        this.transientInt = transientInt;
    }

    public static int getStaticInt() {
        return staticInt;
    }

    public int getNonStaticInt() {
        return nonStaticInt;
    }

    public int getTransientInt() {
        return transientInt;
    }
}
