class Spot {
    private int number;
    private Type type;
    private Car car;

    public Spot(int number, Type type) {
        this.number = number;
        this.type = type;
        this.car = null;
    }

    public boolean isAvailable() {
        return car == null;
    }

    public boolean canFit(Car car) {
        return this.type.getSize() >= car.getSize();
    }

    public void park(Car car) {
        this.car = car;
    }

    public void leave() {
        this.car = null;
    }

    public Car getCar() {
        return car;
    }
}