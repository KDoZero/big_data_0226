package Date클래스;
//Date 클래스 : 운영체제로부터 시간을 읽어오는 클래스, 반드시 객체를 생성해서 사용
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        //원하는 포맷으로 시간을 출력하기 위해서는 SimpleDateFormet 사용
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 년-월-일(MM은 월, mm은 분)
        f2 = new SimpleDateFormat("yy/MM/dd"); //년/월/일
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss"); //HH는 24시간제, hh는 12시간제
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다."); //W는 달의 주, w는 년의 주
        f7 = new SimpleDateFormat("오늘은 yyyy년 w주차입니다.");

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        // Calendar 클래스 : Date 클래스의 단점ㄷ을 보완하기 위해 만들어짐
        // Calendar는 추상 클래스로 특정 국가나 문화의 달력 시스템에 맞게 하위 클래스에서 구현
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1); //배열의 인덱스를 가지고 옴
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.AM_PM));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
