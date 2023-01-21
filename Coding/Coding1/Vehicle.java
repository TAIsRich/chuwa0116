import java.util.*;
import java.io.*;

public class Vehicle {
    private String license;

    public Vehicle(String license) {
        this.license = license;
    }

    public String GetLicense() {
        return license
    }

    public void SetLicense(String license) {
        this.license = license;
    }
}
