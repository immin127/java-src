package Ex06.method;

import java.util.Scanner;

public class EvenOdd {
    static void check(int n){
        System.out.print(n + " 값은 ");
        if(n%2 == 0){
            System.out.println("짝수!");
        } else {
            System.out.println("홀수!");
        }
    }
    public static void main(String[] args) {
        
        check(8);
        for(int i =0; i<9; i++){
            check(i);
        }
    }
}
