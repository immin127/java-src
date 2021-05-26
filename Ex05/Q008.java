package Ex05;

import java.util.Scanner;

public class Q008 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하시시오 : ");
        int n = (new Scanner(System.in)).nextInt();
        
        for(int i = 0; i < 8; i++){
            for(int j =0; j<n; j++){
                if(j%2 == 0){
                    System.out.print("□");
                } else{
                    System.out.print("■");
                }
            }
            System.out.println();
        }
        
    }
}
