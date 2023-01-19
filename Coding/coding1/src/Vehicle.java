public class Vehicle {
    private String license;
    private String color;
    private String brand;
    public Vehicle(String license){
        this.license = license;
    }
    public Vehicle(String license, String color, String brand){
        this.license = license;
        this.color = color;
        this.brand = brand;
    }

    public String getLicense(){
        return license;
    }
}

