package Ex08.Test;

import java.util.Scanner;

public class Exam004 {
    public void shift(){
        Scanner sc = new Scanner(System.in);

        // 행수 얻기
        int line = sc.nextInt();
        // 열수 얻기
        int row = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        // 요소(내용요소수는 행수)를 가진 2차원배열 생성
        int outputArray[][] = new int[row][line];
        // 각 행 공통 인덱스 부분을 하나의 배열로 처리
        for(int i = 0; i < line; i++){
            for(int j = 0; j < row; j ++){
                outputArray[j][i] = sc.nextInt();
            }
        }
        print(outputArray);
    }
    public void print(int [][] outputArray){
        System.out.println("치환됨");
        for(int array[] : outputArray){
            for(int i : array){
                System.out.println(i + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        new Exam004().shift();
    }
}
