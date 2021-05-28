package Ex06.Test.ex04;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        System.out.println("비밀번호는? : ");
        String str = (new Scanner(System.in)).nextLine();
        if(str.equals("hello")){
            System.out.println("환영합니다.");
        }else {
            System.out.println("비밀번호 불일치");
        }
    }
}
