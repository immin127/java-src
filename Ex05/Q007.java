package Ex05;

import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {

        System.out.println("숫자를 입력하십시오.");
        int n = (new Scanner(System.in)).nextInt();
        for(int i = 0; i<8; i++){
            if(i%2 == 0){
                for(int j = 0; j<n; j++){
                    System.out.print("□");
                }
            } else{
                for(int j = 0; j<n; j++){
                    System.out.print("■");
                }
            }
            System.out.println();
        }
    }
}