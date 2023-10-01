class Fruit {
    public String name;

    public Fruit(){
        this.name = "Pear, I hate pears...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Apple extends Fruit {
    public Apple() {
        super();
        this.name = "Apple";
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        Fruit myFruit = new Fruit();
        System.out.println(myFruit instanceof Fruit);
        Apple myApple = new Apple();
        System.out.println(myApple instanceof Fruit);

        Fruit weirdFruit = new Apple();
        Apple castedApple = (Apple) weirdFruit;
        System.out.println(weirdFruit instanceof Fruit);
        System.out.println(castedApple instanceof Fruit);
    }
}