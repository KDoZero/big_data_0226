package 정적메소드;

public class Main {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        kakao.viewAccount();
        System.out.println(Bank.getCount());
    }
}
