package Basic;

import java.util.Arrays;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        // break로 반복을 도중에서 끝냄
        List<String> list = Arrays.asList("Scala", "Java", "Groovy");

        for(String str : list){
            // Java가 발견된 경우에 for문을 종료
            if("Java".equals(str)) {
                break;
            }
            System.out.println(str); // -> Scala
        }

        //continue로 처리를 건너뛴다.
        for(String str : list) {
            // Java가 발견된 경우에는 위의 for로 가서 다음 반복을 함
            if("Java".equals(str)) {
                continue;
            } // continue가 실행된 경우 아래 문장은 실행 안 됨
            System.out.println(str); // -> Scala, Groovy
        }
    }
}
