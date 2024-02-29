package 조건문연습문제2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("세자리 정수를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int a = d / 100;
        int b = (d % 100) / 10;
        int c = d % 10;

        while (a > b) {
            if (a > c) {
                System.out.println(a); break;
            } else {
                System.out.println(c); break;
            }
        } while (a < b) {
            if (b > c) {
                System.out.println(b); break;
            } else {
                System.out.println(c); break;
            }
        }
    }
}
