package java8.optional;

import java.util.Optional;

public class MobileOptional {
    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeaturesOptional> displayFeatures;

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

    public Optional<DisplayFeaturesOptional> getDisplayFeatures() {
        return displayFeatures;
    }

    public void setDisplayFeatures(Optional<DisplayFeaturesOptional> displayFeatures) {
        this.displayFeatures = displayFeatures;
    }
}
