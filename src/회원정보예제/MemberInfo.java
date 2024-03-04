package 회원정보예제;
import java.util.Scanner;

// 클래스는 객체를 생성하기 위한 설계도면이라고 생각하면 됨, 내부에 필드와 메소드가 구현됨
public class MemberInfo {
        // 관리해야 할 필드 추가
        private String name; //private 은 클래스 내부에서만 접근 허용하는 접근제한자
        private int age;
        private char gender;
        private int jobs;
        private Scanner sc = new Scanner(System.in);

        // 세터 메소드
        public void setName() {
            System.out.print("이름을 입력하세요 : ");
            name = sc.nextLine();
        }
        public void setAge() {
            while(true) {
                System.out.print("나이를 입력하세요 : ");
                age = sc.nextInt();
                if(age >= 0 && age < 200) break;
                System.out.println("나이를 잘못 입력하셨습니다.");
            }
        }
        // 성별을 입력받아 성별이 남성이면 정수 값 1을
        public int getGenderType() {
            if(gender == 'M' || gender == 'm') return 1;
            else return 2;
        }
        public void setGender() {
            while(true) {
                System.out.print("성별을 입력하세요 : ");
                gender = sc.next().charAt(0);
                switch (gender) {
                    case 'M':
                    case 'm':
                        System.out.println("남성입니다.");
                        return;
                    case 'W':
                    case 'w':
                        System.out.println("여성입니다.");
                        return;
                    default:
                        System.out.println("성별을 잘못 입력하셨습니다.");
                }
            }
        }
        public void setJobs() {
            while (true) {
                System.out.print("직업을 입력하세요 : ");
                jobs = sc.nextInt();
                if (jobs > 0 && jobs < 5) break; // 리턴은 해당 메소드를 호출한 곳으로 반환값을 반환하고 종료
                System.out.println("직업을 잘못 입력하셨습니다.");
            }
        }

        public void getMember() {
            String[] genderStr = {"", "남성", "여성"};
            String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};
            System.out.println("===== 회원 정보 =====");
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
            System.out.println("성별 : " + genderStr[getGenderType()]);
            System.out.println("직업 : " + jobsStr[jobs]);
        }
}
