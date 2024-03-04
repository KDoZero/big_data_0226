package 반복문연습문제1;
import java.util.Scanner;

// 양의 정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램 작성
// 정수 입력 :
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. : ");
        int n = sc.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=n; j++) {
                System.out.printf("%4d", k++);
            }
            System.out.println("\n");
        }
    }
}
