package Coding;

import javax.swing.text.AsyncBoxView;

public class Encapsulation {

    private int val;

    // overloading constructor
    public Encapsulation(int initVal){
        this.val = initVal;
    }

    public Encapsulation(String strVal){
        this.val = Integer.parseInt(strVal);
    }

    public Encapsulation(float floatVal, int dummyInput){
        this.val = (int) floatVal;
    }

    // method for demostrating inheritance
    public void method1(){
        System.out.println("method in parent class");
    }


    // getter and setter for encapsulation
    public int getVal(){
        return this.val;
    }

    public void setVal(int newVal){
        this.val = newVal;
    }

    public static void main(String[] args) {
        System.out.println("hello world 1123");
    }
}

class ChildClass extends Encapsulation{
    int val;

    public ChildClass(int val){
        super(val);
    }

    // inheritance, overriding parent class method
    public void method1(){
        System.out.println("method in child class");
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation(100);
        e.method1(); // method in parent class
        ChildClass c = new ChildClass(10);
        c.method1(); // method in child class
    }

}
