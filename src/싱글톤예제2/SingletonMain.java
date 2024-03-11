package 싱글톤예제2;

public class SingletonMain {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        test1.setInfo("동그라미", 27);
        test2.viewInfo();
    }
}
