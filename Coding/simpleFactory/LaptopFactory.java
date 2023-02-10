public class LaptopFactory {

    public Laptop createLaptop(String laptopType){
        if (laptopType == null) {
            return null;
        }

        switch (laptopType.toUpperCase()) {
            case "NormalLaptop":
                return new NormalLaptop();
            case "GamingLaptop":
                return new GamingLaptop();
            default:
                return null;
        }
    }
}