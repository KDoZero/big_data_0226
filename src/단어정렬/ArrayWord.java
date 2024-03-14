package 단어정렬;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        sc.nextLine();
        String[] word = new String[n];
        for (int i = 0; i < n; i++) {
            word[i] = sc.nextLine();
            set.add(word[i]);
        }
        ArrayList<String> hword = new ArrayList<>(set);
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    } return -1;
                }
            }
        };
        hword.sort(comp);
        for(String e : hword) System.out.println(e);
    }
}

