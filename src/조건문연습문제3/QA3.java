package 조건문연습문제3;
import java.util.Scanner;

public class QA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("날짜 : ");
        String date = sc.nextLine();
        System.out.print("시간 : ");
        String time = sc.nextLine();

        String month = date.substring(4, 6);
        String greeting = ""; // 빈 문자열로 초기화
        switch(month) {
            case "01":
                greeting = "한파의 연속인 1월 입니다.";
                break;
            case "02":
                greeting = "겨울이 끝나가는 2월 입니다.";
                break;
            case "03":
                greeting = "봄의 기운이 느껴지는 3월 입니다.";
                break;
            case "04":
                greeting = "새싹이 피어나는 4월 입니다.";
                break;
            case "05":
                greeting = "계절의 여왕 5월 입니다.";
                break;
            case "06":
                greeting = "활동하기 좋은 6월 입니다.";
                break;
            case "07":
                greeting = "휴가가 기다려지는 7월 입니다.";
                break;
            case "08":
                greeting = "무더운 8월 입니다.";
                break;
            case "09":
                greeting = "선선한 9월 입니다.";
                break;
            case "10":
                greeting = "천고마비의 계절 10월 입니다.";
                break;
            case "11":
                greeting = "쓸쓸한 늦가을 11월 입니다.";
                break;
            case "12":
                greeting = "한파의 연속인 12월 입니다.";
                break;
            default:
                System.out.println("알 수 없는 월 입니다.");
        }
        System.out.println(name + "님");
        System.out.println(greeting);
        System.out.println("아래의 일정으로" + title + "를 진행하고자 하오니 오셔서 자리를 빛내주시길 바랍니다.");
        System.out.println("===== 행사 안내 =====");
        System.out.println("날짜 : " + date.substring(0,4) + "년 " + month + "월" + date.substring(6,8) + "일");
        System.out.println("시간 : " + time + "시");
    }
}
