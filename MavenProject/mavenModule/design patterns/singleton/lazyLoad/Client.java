public class Client {
    public static void main(String[] args) {
        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = Singleton.getInstance();
        System.out.println(instance3 == instance4);
    }
}
