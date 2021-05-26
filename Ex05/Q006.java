package Ex05;

import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("a의 값을 입력하세요.");
        // int a = sc.nextInt();

        // System.out.println("b의 값을 입력하세요.");
        // int b = sc.nextInt();

        // int d = (int)Math.pow(a, b);


        // System.out.println("a=" + a + ", b=" + b + "인 경우");
        // System.out.println(a + "의 " + b + "제곱은 " + d + "입니다.");

        //
        System.out.println("숫자입력");
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println(n + "! = " + sum);
    }
}
