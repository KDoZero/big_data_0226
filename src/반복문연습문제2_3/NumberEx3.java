package 반복문연습문제2_3;

import java.util.Scanner;

public class NumberEx3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력 : ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 2; i < n; i++) sum += primeFunc(i);
    System.out.println(n + "미만의 소수의 합 : " + sum);
}
    static int primeFunc(int n) {
        boolean isPrime = true;
        for(int i = 2; i<= n/2; i++) {
            if(n % i == 0) isPrime = false;
        }
        if (isPrime) return n;
        else return 0;
    }
}

