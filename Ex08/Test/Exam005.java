package Ex08.Test;

import java.util.concurrent.Flow.Subscription;

public class Exam005 {
    public static void main(String[] args) {

        // int num = 11;
        // for(int i=0; i < 6; i++){
        //     for(int j = 0; j < num; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        //     num--;
        //     for(int k = 0; k < i+1; k++){
        //         System.out.print("*");
        //     }
        // }
        int[] a = new int[11];
        for (int i = 0; i<a.length; i++){
            a[i] = i;
        }
        for(int i = 0; i<6; i++){
            for (int j = 0; j<a.length; j++){
                if(j<i||j>a.length-i-1){
                    System.out.print(" ");
                    //역삼각형을 만들기위해서 양쪽을 지우고 빈칸을 넣음
                }
                else {
                    System.out.print(a[j]);
                    // 삭제가 되지 않은 곳은 배열로 넣음
                }
            }
            System.out.println();
        }
    }
}
