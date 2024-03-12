package 박싱과언박싱;
//Wrapper 클래스 : 기본타입을 객체타입으로 취급해야하는 경우에 사용(제네릭, 컬렉션 프레임워크)
public class BoxingEx {
    public static void main(String[] args) {
        Integer num = new Integer(17); //박싱
        int n = num.intValue(); //언박싱
        Integer sum = 17; //오토박싱
        int s = sum; //오토언박싱
    }
}
