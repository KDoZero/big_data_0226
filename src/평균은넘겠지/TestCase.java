package 평균은넘겠지;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        double[] arr = new double[tc];
        int total = 0;
        int cnt = 0;
        for(int i = 0; i < tc; i++) {
            int num = sc.nextInt();
            int[] score = new int[num];
            for(int j = 0; j < num; j++){
                score[j] = sc.nextInt();
                total += score[j];
            }
            for(int k =0; k < num; k++) {
                if(score[k] > (total / num)) cnt++;
            }
            arr[i] = (double) cnt / num;
            total = 0;
            cnt = 0;
        }
        for(int i = 0; i < tc; i++) {
            System.out.println(Math.round(arr[i] * 100) + "%");
        }
    }
}
