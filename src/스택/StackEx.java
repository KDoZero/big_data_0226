package 스택;
//스택은 Las-in-First-out 으로 동작 (생각보다 프로그램 내부에서는 상당히 많이 사용)
//네비게이션 이동, 함수의 호출 등등에서 많이 사용
//Vector 클래스의 기능을 제한해서 사용
import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(345);
        stack.push(56);
        System.out.println(stack.peek()); //최상위값 확인
        System.out.println(stack.pop()); //최상위 값 추출, 보여줌
        System.out.println(stack.empty()); //스택이 비었는지 확인
        System.out.println(stack.size()); //스택의 크기를 확인
        System.out.println(stack.contains(1)); //스택에 해당 값이 포함되어 있는지 확인
        System.out.println(stack.peek());
    }
}
