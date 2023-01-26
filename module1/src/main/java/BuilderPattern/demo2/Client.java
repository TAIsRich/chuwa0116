package BuilderPattern.demo2;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                            .cpu("cpu")
                            .screen("screen")
                            .memory("memory")
                            .mainBoard("mainBoard").build();
        System.out.println(phone.toString());
    }
}
