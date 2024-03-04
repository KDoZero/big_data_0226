package 반복문3번;
// 이중 for문 사용해서 구구단 찍기
public class DoubleForEx {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            if ( i % 2 == 0) continue;
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
