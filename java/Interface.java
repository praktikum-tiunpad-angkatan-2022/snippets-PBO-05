interface Life {
    public void eat();
}

interface Entity {
    public void travel();
}

interface Animal extends Life, Entity {
    public void eat();
    public void travel();
}

class Cat implements Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }

    @Override
    public void travel() {
        System.out.println("Walks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cat felix = new Cat("Felix");
        felix.eat();
        felix.travel();
    }
}
