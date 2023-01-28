package java8.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        TestReference testReference = new TestReference("Erfan");
        List<String> lastNames = new ArrayList<>(Arrays.asList("Wang", "Li" ,"Zhou"));
        lastNames.forEach(testReference::print);
    }

}

class TestReference {
    String name;

    public TestReference(String name) {
        this.name = name;
    }

    public void print(String lastName){
        System.out.println(name + " " + lastName);
    }
}
