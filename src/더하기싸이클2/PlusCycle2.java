package 더하기싸이클2;

import java.util.Scanner;

public class PlusCycle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; //입력받은 수의 10의 자리와 1의 자리를 분리해서 더하기 위한 변수
        int newNumber = 0; //새롭게 만들어진 변수
        int cnt = 0;
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int tmp = input; //입력받은 값이 변경되는 것을 막기위해 변수에 담음
        while (true) {
            sumNumber = (tmp / 10) + (tmp % 10); //입력받은 수의 10의자리와 1의 자리를 분리해서 더함
            newNumber = (tmp % 10) * 10 + (sumNumber % 10); //입력값의 1의 자리 + 계산된 값의 1의 자리를 더함
            cnt++;
            if(input == newNumber) break;
            tmp = newNumber;
        }
        System.out.println(cnt);
    }
}
