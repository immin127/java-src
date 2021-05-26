package Ex05;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q011 {
    public static void main(String[] args) {
        // Calendar c= Calendar.getInstance();
        // Date d = c.getTime();
        // Format f = new SimpleDateFormat("yyyy년 MM월 dd일");

        // System.out.println(f.format(d));

        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);

        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH)+1; //1을 더해줘야 바르게 나옴
        int d = c.get(Calendar.DAY_OF_MONTH); //DAY와 다름

        System.out.println(y + "년 " + m + "월 " + d + "일");

    }
}
