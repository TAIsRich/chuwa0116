package java8.default_interface_method;

public interface DIML {
    static final String BLOG = "is Chuwa a";

    int add(int a, int b);

    default int subtract(int a, int b){
        return  a - b;
    }
    static String blogName(){
        return BLOG;
    }
}
