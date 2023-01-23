public class Parkinglot {
    private String name;
    private String address;
    // different sizes cars active count
    private int small_v;
    private int middle_v;
    private int large_v;
    // total count of each kind of spots
    private final int small_total;
    private final int middle_total;
    private final int large_total;

    public Parkinglot(String name, String address, int s, int m, int l){
        this.name = name;
        this.address = address;
        this.small_total = s;
        this.middle_total = m;
        this.large_total = l;
    }

    public boolean isFull(Vehicle v) {
        String type = v.type;
        if(type == "small"){
            return small_v >= small_total;
        }
        if(type == "middle"){
            return middle_v >= middle_total;
        }
        if(type == "large"){
            return large_v >= large_total;
        }
        
        return false;
    }
    public void addSpots(Vehicle v){
        String type = v.type;
        if(type == "small"){
            small_v++;
        }
        else if(type == "middle"){
            middle_v++;
        }
        else if(type == "large"){
            large_v++;
        }
    }
    
}
