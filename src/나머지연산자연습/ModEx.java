package 나머지연산자연습;

import java.util.Scanner;

// 100의 자리 정수를 입력받아서 3개의 변수에 나눠 담기

public class ModEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
