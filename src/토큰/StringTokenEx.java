package 토큰;
import java.util.Scanner;
import java.util.StringTokenizer;

//StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우
//구분자 기준으로 잘라서 새로운 문자열 생성
public class StringTokenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 : ");
        String names = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(names, "/");
//        String[] nameStr = new String[st.countTokens()];  //남아있는 토큰 수
//        int idx = 0;
//        while (st.hasMoreTokens())  { //hasMoreTokens는 남아있는 토큰이 있는지 여부 확인
//            nameStr[idx++] = st.nextToken(); //남아잇는 토큰을 하나씩 꺼냄
//        }
        String[] nameStr = names.split("/");
        for(String e : nameStr) System.out.print(e + " ");

    }
}
