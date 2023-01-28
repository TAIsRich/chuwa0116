package feature.default_interface_method;

public class DIMImpl  implements  DIML{
    //method add: need to be override
    //method substract: is a default method, does not need to be override
    @Override
    public int add(int a, int b) {
        return  a + b;
    }
}
