package Ex06.method;

import java.util.Scanner;

public class Test01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println(">");
            String exit = sc.next();
            if(exit.equals("exit")||exit.equals("EXIT")){
                sc.close();
                break;

            } else {
                System.out.println("대기중");
            }
        } // 미입력 오류처리도 해주어야햠
    }
}
