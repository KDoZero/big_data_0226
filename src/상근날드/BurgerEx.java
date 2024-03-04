package 상근날드;

import java.util.Scanner;

// 햄버거 3가지 종류
// 음료 2가지 종류
// 햄버거 3가지 중 가장 싼 것, 음료 2가중 중 가장 싼 것의 가격을 선택하고
// 세트 메뉴이므로 50원 할인해서 금액 계산
// 1차원 배열을 사용하는 문제
public class BurgerEx {
    public static void main(String[] args) {
        // 메뉴를 저장할 5개 배열 생성
        int[] menu = new int[5];
        // 배열에 햄버거와 음료 가격을 입력받음
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.print("");
            menu[i] = sc.nextInt();
        }
        // 햄버거와 음료의 값을 비교하기 위한 기준값 결정(배열의 값 중 한개)
        // 햄버거와 음료 중 제일 싼 메뉴 찾기
        int Bprice;
        if (menu[0] > menu[1]) {
            Bprice = (Math.min(menu[1], menu[2]));
        } else {
            Bprice = (Math.min(menu[0], menu[2]));
        }
        int Aprice = (Math.min(menu[3],menu[4]));
        //50원 할인해서 결과 출력하기
        System.out.println(Bprice + Aprice - 50);

    }
}
