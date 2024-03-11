package super1번;

public class SuperEx1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
    }
}
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void childMethod() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
