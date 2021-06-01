package Basic;

import java.io.File;
import java.io.IOException;

public class Ex09 {
    public static void main(String[] args) {
        // 예외처리
        // try ~ catch ~ fianlly문
        // try {
        //     예외가 발생할 가능성이 있는 처리
        // } catch (예외형 변수명) {
        //     예외가 발생했을 때 실행하는 처리
        // } finally { 
        //     예외 발생 유무에 상관 없이 마지막에 반드시 실행할 처리
        // }

        try {
            new File("text.txt").createNewFile();

            //IOException이 발생한 경우
        } catch (IOException e) {
            System.out.println("파일 생성 실패: " + e.getMessage());
        }

        // catch 블록이 복수인 경우 최초에 형태가 일치한 1블록만을 실행한다.
        try {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
