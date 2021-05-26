package Ex05;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q009 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        Date d = c.getTime();
        Format f = new SimpleDateFormat("yyyy년 MM월 dd일");

        System.out.println(f.format(d));
    }
}
