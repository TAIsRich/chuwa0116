package designPattern.abstractFactory;

public abstract class Dessert {

    public abstract void show();
}

class Tiramisu extends Dessert{
    public void show(){
        System.out.println("tiramu class");
    }
}

class MochaMousse extends Dessert{
    public void show(){
        System.out.println("MochaMousse class");
    }
}


