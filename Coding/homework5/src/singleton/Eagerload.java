package singleton;

public class Eagerload {
    public static Eagerload instance;

    private Eagerload()
    {
    }
    static
    {
        instance = new Eagerload();
    }
}
