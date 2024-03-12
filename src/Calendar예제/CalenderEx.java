package Calendar예제;
import java.util.Calendar;

public class CalenderEx {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int a = 0;
        if(calendar.get(Calendar.AM_PM) == 1) a = 12;
        System.out.println(calendar.get(Calendar.YEAR) + "년"
                + (calendar.get(Calendar.MONTH)+1) + "월"
                + calendar.get(Calendar.DAY_OF_MONTH) + "일 "
                + (calendar.get(Calendar.HOUR)+a) + "시"
                + calendar.get(Calendar.MINUTE) + "분"
                + calendar.get(Calendar.SECOND) + "초");
    }
}
