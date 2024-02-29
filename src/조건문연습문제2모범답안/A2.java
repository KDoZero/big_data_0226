package 조건문연습문제2모범답안;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        if(a > b) {
            System.out.println(Math.max(a, c));
        } else
            System.out.println(Math.max(b, c));

    }
}
