package 반복문연습문제1_2;
import java.util.Scanner;

public class SquareEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <=n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }
    }
}
