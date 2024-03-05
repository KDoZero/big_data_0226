package 손익분기점;
import java.util.Scanner;
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedCost = sc.nextInt();
        int variableCost = sc.nextInt();
        int price = sc.nextInt();
        int bep = ((fixedCost / (price - variableCost)) / 1) + 1;
        if (bep > 0) System.out.println("손익분기점은 " + bep + "입니다.");
        else System.out.println(-1);
    }
}
