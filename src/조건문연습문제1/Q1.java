package 조건문연습문제1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       while(true) {
           System.out.println("점수를 입력하세요. :");
           int score = sc.nextInt();
           String grade = "";

           switch(score/10) {
               case 10:
               case 9:
                   grade = "A"; System.out.println(grade);
                   break;
               case 8:
                   grade = "B"; System.out.println(grade);
                   break;
               case 7:
                   grade = "C"; System.out.println(grade);
                   break;
               case 6:
                   grade = "D"; System.out.println(grade);
                   break;
               case 5:
               case 4:
               case 3:
               case 2:
               case 1:
               case 0:
                   grade = "F"; System.out.println(grade);
                   break;
               default:
                   System.out.println("잘못입력하였습니다. 다시 입력해주세요. : ");
                   continue;
           }
           break;
           }
       }
    }

