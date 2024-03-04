package 반복문연습문제2_2;

import java.util.Scanner;

public class NumberEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        String outString = primeFunc(n) ? "은 소수입니다." : "은 소수가 아닙니다.";
        System.out.println(n + outString);
    }
    static boolean primeFunc(int n) {
        boolean isPrime = true;
        for(int i = 2; i<= n/2; i++) {
            if(n % i == 0) return false;
        }
        return isPrime;
    }
}
