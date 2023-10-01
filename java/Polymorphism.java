class Parent {
    int x = 5;

    public void showInfo() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int x = 10;

    @Override
    public void showInfo() {
        System.out.println("Child");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Parent testParent = new Child();
        System.out.println(testParent.x);
        testParent.showInfo();
    }
}