class ParkingLot {
    private List<Level> levels;
    private int capacity;

    public ParkingLot(int capacity) {
        this.levels = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean park(Car car) {
        for (Level level : levels) {
            if (level.park(car)) {
                return true;
            }
        }
        return false;
    }

    public boolean leave(Car car) {
        for (Level level : levels) {
            if (level.leave(car)) {
                return true;
            }
        }
        return false;
    }
}