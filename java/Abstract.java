package Abstract;

abstract class Animal {
    private String name;

    public Animal(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public abstract String getSound();
}

class Cat extends Animal {
    public Cat(String name) {
      super(name);
    }

    @Override
    public String getSound() {
      return "Miaw";
    }
}

public class Abstract {
    public static void main(String[] args) {
        Cat catus = new Cat("Mewo");
        System.out.println(catus.getName());
        System.out.println(catus.getSound());
    }
}
