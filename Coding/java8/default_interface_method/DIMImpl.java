package java8.default_interface_method;

/**
 * @author Zhipeng Yin
 * @date 2023-01-27 18:20
 */
public class DIMImpl implements DIML{

    /**
    * 必须要override add方法 default方法不override也不会报错
    * */
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
