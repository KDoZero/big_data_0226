package 피시방알바;
import java.util.Scanner;

public class PcRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member = sc.nextInt();
        int[] seat = new int[member];
        int error = 0;
        for(int i = 0; i < seat.length; i++) {
            seat[i] = sc.nextInt();
            for(int j = 0; j < i; j++) {
                if(seat[i] == seat[j]) { error++; break;}
            }
        }
        System.out.println(error);
    }
}
