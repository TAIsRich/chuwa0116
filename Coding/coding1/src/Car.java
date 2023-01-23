class Car {
    private String license;
    private Type size;

    public Car(String license, Type size) {
        this.license = license;
        this.size = size;
    }

    public Type getSize() {
        return size;
    }
}

enum Type {
    SMALL(1), MEDIUM(2), LARGE(4);

    private int size;

    Type(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}