package KMP;

import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // 해당 인덱스의 문자를 추출
            if (ch >= 'A' && ch <= 'Z') System.out.print(str.charAt(i));
        }
    }
}