package Basic;

import java.util.Scanner;

public class Test01{
    public static void main(String[] args) {
        // 삼항 연산자
        // 조건식 ? true인 경우의 값 : false인 경우의 값
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        String s = age >= 20 ? "성인" : "미성년자";
        System.out.println("삼항연산자 사용 : 당신은 " + s + " 입니다.");

        // if문의 경우
        String s2 = null;
        if(age >= 20){
            s2 = "성인";
        } else {
            s2 = "미성년자";
        }
        System.out.println("if문 사용 : 당신은 " + s2 + " 입니다.");
    }
}