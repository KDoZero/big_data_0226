package 상근날드2;
import java.util.Scanner;

public class BurgerEx2 {
    public static void main(String[] args) {
        int[] menu = new int[5]; // 정수 5개자리 배열 생성
        Scanner sc = new Scanner(System.in); // 입력을 받기위한 스캐너
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int minBurger = menu[0]; // 버거 중 한개의 임의의 값
        int minDrink = menu[3]; // 음료 중 한개의 임의의 값
        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);


    }
}
