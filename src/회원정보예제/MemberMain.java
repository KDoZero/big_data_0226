package 회원정보예제;
// 이름 입력
// 나이 입력 : 1~199 사이의 정수 값
// 성별 입력 : M/m, F/f
// 직업 입력 : 1~4 사이의 정수 입력 (1-학생, 2-회사원, 3-무직, 4-주부)
// 최종 출력 : 모든 입력이 완료되면 한번에 출력
// 나이, 성별, 직업에서 유효한 값이 아니면 재입력 요구
public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스로 객체생성
        memberInfo.setName(); // 이름을 입력받는 메소드 호출
        memberInfo.setAge(); // 나이를 입력받는 메소드 호출
        memberInfo.setGender(); // 성별을 입력받는 메소드 호출
        memberInfo.setJobs(); // 직업을 입력받는 메소드 호출
        memberInfo.getMember(); // 전체 출력r
    }
}
