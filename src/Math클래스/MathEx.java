package Math클래스;
//Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
//Math 클래스의 모든 메소드는 클래스 메소드이므로, 객체 생성을 하지 않음
//java.lang 기본 패키지에 포함되어 있어 별도의 import가 필요없음
public class MathEx {
    public static void main(String[] args) {
        //random() : 0.0이상 1.0미만의 임의의 double 형의 값을 생성해서 반환
        System.out.println((int)(Math.random() * 45) + 1);
        //abs() : 절대값(음수이면 양수, 양수이면 양수)
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));
        //ceil() : 소수점 이하 올림
        System.out.println(Math.ceil(3.141592));
        System.out.println(Math.ceil(10.000000000001));
        //floor() : 소수점 이하 내림(제거)
        System.out.println(Math.floor(10.999999999999));
        //round() : 소수점 이하 반올림
        System.out.println(Math.round(10.49999999));
        System.out.println(Math.round(10.50000000));
        //max() : 두개의 변수 중 큰 값 반환
        System.out.println(Math.max(100,200));
        //min() : 두개의 변수 중 작은 값 반환
        System.out.println(Math.min(100,200));

    }
}
