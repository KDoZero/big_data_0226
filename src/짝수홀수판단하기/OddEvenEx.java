package 짝수홀수판단하기;

import java.util.Scanner;

// 임의의 정수를 입력받아 해당 값이 짝수인지 홀수인지 출력하는 문제
public class OddEvenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();
        //내 답안
        if(num % 2 == 0){
            System.out.print("짝수입니다.");
        } else{
            System.out.print("홀수입니다.");
        }
        /* 모범답안
        String outString = (num % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
        System.out.println(outString);
         */

    }
}
