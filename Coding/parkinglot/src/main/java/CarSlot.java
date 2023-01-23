public class CarSlot {
    private int id;
    private int levelId;
    private boolean avail;

    private Car c;

    public CarSlot(int id, int levelId, boolean avail, Car c) {
        this.id = id;
        this.levelId = levelId;
        this.avail = avail;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    public boolean isAvail() {
        return avail;
    }

    public boolean park(Car car){
        if(this.isAvail()){
            this.c = car;
            this.avail = false;
            return true;
        }else{
            System.out.println("This slot is not available!");
            return false;
        }
    }

    public boolean free(){
        if(!this.isAvail()){
            this.avail = true;
            this.c = null;
            return true;
        }
        return false;
    }
}