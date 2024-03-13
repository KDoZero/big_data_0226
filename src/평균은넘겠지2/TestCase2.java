package 평균은넘겠지2;
import java.util.Scanner;
public class TestCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] result = new double[testCnt];
        for(int i = 0; i < result.length; i++) {
            result[i] = overRate();
        }
        for(double e : result) System.out.printf("%.3f%%\n",e);
    }
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int overCnt = 0;
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = (double) total / studentCnt;
        for(int e : score) if (e > average) overCnt++;
        return (double)overCnt / studentCnt * 100;
    }
}
