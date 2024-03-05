package 핸드폰요금;
import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        int Y = 0, M = 0;
        boolean isTime = true;
        System.out.print("통화 횟수 : ");
        int k = sc.nextInt();
        System.out.print("통화 시간 : ");
        for (int i = 0; i < k; i++) {
            num[i] = sc.nextInt();
            if(num[i] > 10000) isTime = false;
            Y += ((num[i] / 30) + 1) * 10;
            M += ((num[i] / 60) + 1) * 15;
        }
        if(isTime) {
            if (Y < M) System.out.println("Y " + Y);
            else if (M < Y) System.out.println("M " + M);
            else System.out.println("Y " + Y + "M " + M);
        } else System.out.println("잘 못 입력하셨습니다.");


    }
}
