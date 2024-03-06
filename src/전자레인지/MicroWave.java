package 전자레인지;

import java.util.Scanner;

public class MicroWave {
    public static void main(String[] args) {
        int A = 300;
        int B = 60;
        int C = 10;
        int a = 0, b = 0, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("요리 시간을 입력해주세요 : ");
        int T = sc.nextInt();

        if(T / A != 0) {
            a = T / A;
            T -= (300*a);
        }
        if(T / B != 0) {
            b = T / B;
            T -= (60*b);
        }
        c = T / C;
        T -= (10*c);

        if(T == 0) {
            System.out.println("A " + a + "번, B " + b + "번, C " + c + "번 눌러주세요.");
        } else System.out.println(-1);
    }
}
