class Animal{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("have no idea what to eat!");
    }

    public void bark(){
        System.out.println("the sound of animal is quite cute!");
    }
}

class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("Cat likes to eat beef!");
    }
    @Override
    public void bark(){
        System.out.println("The sound of cat is miaomiaomiaomiaomiao!");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog likes to eat chicken breast！");
    }
    @Override
    public void bark(){
        System.out.println("The sound of dog is wangwangwangwangwang!");
    }
}
