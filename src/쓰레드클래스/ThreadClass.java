package 쓰레드클래스;

public class ThreadClass {
    public static void main(String args[]){
        Thread subThread1 = new CustomThread(); // Thread를 상속한 객체 생성
        subThread1.start();
    }
}

