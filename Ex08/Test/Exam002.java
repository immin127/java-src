package Ex08.Test;

import java.util.Scanner;

public class Exam002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력된 숫자를 int형 변수에 저장
        int number = sc.nextInt();

        //반복계산 숫자 정의
        int a = 1;

        //입력된 숫자만큼 요소를 가진 String형 배열 생성
        String [] array = new String[number];

        //개별 요소로 채워져 감
        for(int i=0; i < array.length; i++){
            System.out.println(a++ + " > Hello World!");
    }
    }
}
