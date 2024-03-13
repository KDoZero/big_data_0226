package 소수단어;
import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = 0;
        boolean isPrime = true;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) < 91) n += (word.charAt(i) - 38);
            else n += (word.charAt(i) - 96);
        }
        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
