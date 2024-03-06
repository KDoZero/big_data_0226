package 객체타입확인;
//객체타입을 활용하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Child child = new Child("11111");
    }
}
class Parent {
    String name;
    Parent(String name) {

    }
}

class Child extends Parent{
    Child(String name) {
        super("123123");
        this.name = name;
    }
}
