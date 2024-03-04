package 반복문연습문제2;

import java.util.Scanner;

// 입력받은 수가 소수인지 아닌지 판별하기 (소수란? 1과 자기자신 이외의 수로는 나누어지지 않는 수)
// 정수 입력 :
// 소수 입니다. / 소수가 아닙니다.
public class NumberEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        boolean isPrime = true; // 소수인지 아닌지 판별하는 변수
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) isPrime = false;
        }
        if(n == 0) System.out.println("0은 어디에도 포함되지 않습니다.");
        else {
            if (isPrime) System.out.println(n + "은 소수 입니다.");
            else System.out.println(n + "은 소수가 아닙니다.");
        }
    }
}
