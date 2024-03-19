package 실습문제파일입출력과정렬;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentArray {
    public static void main(String[] args)  {
        FileInputStream fis = null;
        TreeSet<Studentinfo> stuinfo = new TreeSet<>();
        try {
            fis = new FileInputStream("Student.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] sarray = line.split(" ");
            String name = sarray[0];
            int sc1 = Integer.parseInt(sarray[1]);
            int sc2 = Integer.parseInt(sarray[2]);
            int sc3 = Integer.parseInt(sarray[3]);
            int total = (sc1 + sc2 + sc3);
            float avg = (float) total / 3;
            stuinfo.add(new Studentinfo(name, total, avg));
        }
        int i =1;
        for(Studentinfo e : stuinfo){
            System.out.printf("%d. %s, %d, %.2f\n", i++, e.getName(),e.getSum(),e.getAvg());
        }

    }
}

