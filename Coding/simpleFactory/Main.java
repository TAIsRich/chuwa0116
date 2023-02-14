public class Main {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();

        Laptop myLaptop = laptopFactory.createLaptop("GamingLaptop");
        myLaptop.runTests();
    }
}
