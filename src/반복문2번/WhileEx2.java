package 반복문2번;
import java.util.Scanner;
// 반복문의 종류 : while, do ~ while, for
// while문은 대부분의 경우 횟수가 정해지지 않는 경우에 사용
// for문은 반복 횟수가 정해져 있는 경우에 사용
public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
//        while (true) {
//            System.out.print("나이를 입력하세요 : ");
//            age = sc.nextInt();
//            if (age >= 0 && age < 200) break;
//            System.out.println("나이를 잘 못 입력하셨습니다.");
//        }
        boolean isRetry = false;
        do {
            System.out.println("나이를 입력하세요. : ");
            age = sc.nextInt();
            if(isRetry) {
                System.out.println("나이를 잘 못 입력하셨습니다.");
            }
            isRetry = true;

        } while(age < 0 || age >= 200);
        System.out.println("당신의 나이는 " + age + "입니다.");
    }
}
