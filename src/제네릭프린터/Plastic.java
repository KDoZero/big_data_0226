package 제네릭프린터;

public class Plastic {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
