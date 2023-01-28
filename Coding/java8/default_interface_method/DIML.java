package java8.default_interface_method;

/**
 * @author Zhipeng Yin
 * @date 2023-01-27 18:20
 */
public interface DIML {
    static final String BLOG = "is Chuwa a";

    int add(int a,int b);

    default  int substract(int a,int b){
        return a-b;
    }

    static String blogName(){
        return  BLOG;
    }

}
