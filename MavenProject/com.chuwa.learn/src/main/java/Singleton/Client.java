package Singleton;

public class Client {
  public static void main(String[] args) {
    EagerLoad ins = EagerLoad.getInstance();
    EagerLoad ins1 = EagerLoad.getInstance();
    System.out.println(ins == ins1);

    LazyLoad in = LazyLoad.getInstance();
    LazyLoad in1 = LazyLoad.getInstance();
    System.out.println(in == in1);
  }
}
