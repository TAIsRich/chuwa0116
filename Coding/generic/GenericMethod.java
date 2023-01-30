package Coding.generic;

public class GenericMethod {
//compare with non_generic method can be seen differences
public static void main(String[] args) {
    System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
            MaxGeneric.getMax(3, 4, 5));
    System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
            MaxGeneric.getMax(6.6, 8.8, 7.7));
    System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
            MaxGeneric.getMax("pear", "apple", "orange"));
}
}
class MaxGeneric{
    // public +  static + 方法类型（泛型）+ 函数名
    public static <T extends Comparable<T>>T getMax(T x, T y, T z){
    return x;
}
}
