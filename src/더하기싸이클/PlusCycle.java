package 더하기싸이클;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();
        int num1 = num;
        int num2 = 0;
        int cnt = 0;
        while (true) {
            if (num1 < 10) {
                num2 = num1 * 11;
            } else {
                num2 = ((num1 / 10) * 10 + (num1 / 10) + (num1 % 10));
            }
            cnt++;
            num1 = num2;
            if(num == num1) break;
        }
        System.out.println(cnt);
    }
}
