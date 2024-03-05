package 핸드폰요금2;
import java.util.Scanner;
public class PhoneBill2 {
    public static void main(String[] args) {
        int[] call = new int[20]; // 총 통화 횟수에 대한 시간저장
        int yPay = 0, mPay = 0; //각각의 요금제에 총 요금을 누적하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 입력 : ");
        int cnt = sc.nextInt();
        System.out.print("통화 시간 입력 : ");
        for(int i = 0; i < cnt; i++) { // 총 통화 횟수만큼 반복하며 통화시간을 call배열에 대입
            call[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
            yPay += (call[i] / 30) * 10 + 10; //각 배열의 통화 시간을 요금으로 환산하고 누적함
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        } else if (yPay < mPay) {
            System.out.println("Y " + yPay);
        } else {
            System.out.println(" Y M " + yPay);
        }


    }
}
