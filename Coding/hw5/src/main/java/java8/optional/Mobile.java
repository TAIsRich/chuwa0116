package java8.optional;

public class Mobile {
    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisplayFeatures getDisplayFeatures() {
        return displayFeatures;
    }

    public void setDisplayFeatures(DisplayFeatures displayFeatures) {
        this.displayFeatures = displayFeatures;
    }
}
