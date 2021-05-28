package Ex06;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calendar cal = Calendar.getInstance();

        // System.out.println("오늘 몇월 몇일 입니까?");
        // System.out.println("몇월? =");
        // int m = sc.nextInt();
        // System.out.println("몇일? =");
        // int d = sc.nextInt();

        // int tm = cal.get(Calendar.MONTH)+1;
        // int td = cal.get(Calendar.DATE);

        // System.out.println(tm + td);

        // if(tm == m && td == d){
        //     System.out.println("오늘");
        // } else {
        //     System.out.println("입력이 잘못 되었습니다.");
        // }
        System.out.println("오늘 몇월 몇일입니까?");
        String input = "";
        System.out.println("몇월?");
        int inputMonth = Integer.parseInt(sc.nextLine());
        System.out.println("몇일?");
        int inputDay = Integer.parseInt(sc.nextLine());

        Calendar cal = Calendar.getInstance();
        int mon = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);

        if(inputMonth == mon && inputDay == day){
            System.out.println("정답");
        } else {
            System.out.println("오답");
        }
    }
}
