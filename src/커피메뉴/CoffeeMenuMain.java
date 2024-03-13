package 커피메뉴;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//해시맵을 이용한 커피 메뉴 만들기
public class CoffeeMenuMain {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    //초기 메뉴 추가하기
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "일반커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2200,"Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유포함"));
    }
    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;
        while(true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.print("[1]보기 [2]조회 [3]추가 [4]삭제 [5]수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1:
                    System.out.println("======= 메뉴 보기 =======");
                    for(String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).category);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("-------------------------------");
                    }
                    break;
                case 2:
                    System.out.print("조회 할 메뉴를 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("-------------------------------");
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.print("추가할 메뉴를 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격입력 : ");
                        int price = sc.nextInt();
                        System.out.print("카테고리 입력 : ");
                        String category = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key,new MenuInfo(key, price, category, desc));
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제했습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 존재하지 않습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("카테고리 입력 : ");
                        String category = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.replace(key, new MenuInfo(key, price, category, desc));
                    } else {
                        System.out.println("수정할 메뉴가 존재하지 않습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
            }
        }
    }
}
