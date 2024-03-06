package 집주소2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] zero = {4, 2, 3, 3, 3, 3, 3, 3, 3};
        List<Integer> rst = new ArrayList<>();
        int sum = 0;
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for(int i = 0; i < num.length(); i++){
                sum += zero[num.charAt(i) - '0'] + 1;
            }
            rst.add(sum + 1);
            sum = 0;
        }
        for(int e : rst) System.out.println(e);
    }
}