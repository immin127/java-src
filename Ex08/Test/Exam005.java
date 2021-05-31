package Ex08.Test;

import java.util.concurrent.Flow.Subscription;

public class Exam005 {
    public static void main(String[] args) {

        int num = 11;
        for(int i=0; i < 6; i++){
            for(int j = 0; j < num; j++){
                System.out.print(j);
            }
            System.out.println(" ");
            num--;
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
        }
    }
}
