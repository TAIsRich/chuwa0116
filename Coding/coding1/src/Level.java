class Level {
    private int floor;
    private List<Spot> spots;
    private int capacity;

    public Level(int floor, int capacity) {
        this.floor = floor;
        this.spots = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean park(Car car) {
        for (Spot spot : spots) {
            if (spot.isAvailable() && spot.canFit(car)) {
                spot.park(car);
                return true;
            }
        }
        return false;
    }

    public boolean leave(Car car) {
        for (Spot spot : spots) {
            if (spot.getCar() == car) {
                spot.leave();
                return true;
            }
        }
        return false;
    }
}