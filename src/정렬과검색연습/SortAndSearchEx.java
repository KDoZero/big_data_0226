package 정렬과검색연습;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수를 입력하세요. : ");
        int num1 = sc.nextInt();
        System.out.print("임의의 수를 입력하세요. : ");
        int num2 = sc.nextInt();
        int[] arr = new int[num1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * arr.length) + 1);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,num2));
        System.out.println(Arrays.toString(arr));
    }
}
