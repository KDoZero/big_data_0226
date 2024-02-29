package 변수연습;

public class VarEx {
    public static void main(String[] args) {
        int age;// 나이를 저장하기 위해 4Byte 공간을 확보함.
        age = 100; // age라는 변수에 100이라는 값을 넣음.
        double taxRate = 1.0; // taxRate(자바의 카멜표기법),tax_rate(파이썬의 스네이크 표기법)
        int jobs; // 변수이름은 소문자로 지워야 함.

        int year = 2024; // 선언과 동시에 값을 할당
        int day = 0; // 선언과 동시에 값을 0으로 초기화
        String name = null; // 이름이라는 문자를 담는 변수를 선언하고 초기화(null,"")

        int n = 20;
        int m = 30;
        if(n > 10) {
            m = n - 10;
        }
        int k = n + m; //m은 이미 메모리에서 사라지고 없음.
        System.out.println("k : " + k);

        String addr = "서울시 강남구 역삼동 KH정보교육원";
        String addr2 = "서울시 강남구 역삼동 KH정보교육원";
        //실수형 : 지수와 가수로 표현되면 가수 부분이 정밀도와 연관이 있음, 근사치 표기법
        float height = 170.55f; // float형은 표기시 F, f를 붙혀야함.
        double pi = 3.145992653589793;

        //상수(constant) : 고정된 값을 표기 할 때 사용
        final double PI = 3.141592; // 한번 값이 대입되면 더이상 변경되지 않음.
        final int YEAR = 365;


    }
}
