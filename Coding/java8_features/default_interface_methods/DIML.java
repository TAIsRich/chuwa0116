public interface DIML {
    static final String BLOG = "Chuwa";

    int add(int a, int b);

    default int subtract(int a, int b){
        return a-b;
    }

    static String blogName(){
        return BLOG;
    }
}
