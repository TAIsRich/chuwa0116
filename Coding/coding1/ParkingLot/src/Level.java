public class Level {
    private Slot[] slots;
    private int id;

    private int nums;

    public Level(int id, int nums) {
        this.id = id;
        this.nums = nums;
        slots = new Slot[nums];
        for(int i = 0; i < nums; i++){
            slots[i] = new Slot(i, id, true, null);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public boolean isAvial(){
        return this.nums > 0;
    }

    public boolean park(int i, Car c){
        boolean f = slots[i].park(c);
        if(f){
            this.nums -= 1;
            return true;
        }else{
            return false;
        }
    }

    public boolean free(int i){
        boolean f = slots[i].free();
        if(f){
            this.nums += 1;
            return true;
        }else{
            return false;
        }
    }
}
