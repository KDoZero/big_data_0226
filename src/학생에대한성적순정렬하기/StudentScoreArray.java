package 학생에대한성적순정렬하기;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentScoreArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Grade> treeSet = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            treeSet.add(new Grade(name,score));
        }

    }
}

class Grade {
    String name = "";
    int score;
    public Grade(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

    @Override
    public int compare(Grade o) {
        if(this.score < o.score) return 1;
        else if(this.score == o.score) {
            return name.compareTo(o.name);
        } else return -1;
    }
}