package 손익분기점2;
import java.util.Scanner;
public class BreakEvenPoint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedCost = sc.nextInt(); //고정비용
        int varCost = sc.nextInt(); //가변(생산)비용
        int sellPrice = sc.nextInt(); //판매금액
        if (varCost >= sellPrice) { //가변비용이 판매금액과 같거나 크면 절대 이익이 발생할 수 없음.
            System.out.println("-1");
            return;
        }
        System.out.println(fixedCost / (sellPrice - varCost) + 1);
    }
}
