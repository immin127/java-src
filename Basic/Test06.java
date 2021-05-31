package Basic;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    // for문
    // for(초기화; 조건; 갱신){
    //     처리
    // }

    // 3회 루프
    for(int i = 0; i < 3; i++){
        System.out.println(i + "번째 처리");
    }
    
    // List, Map과 같은 컬렉션과 배열의 요소를 순차적으로 처리할 경우 확장 for문이 편리
    // 확장 for문
    // for(형 변수명 : 컬랙션이나 배열){
    //     처리
    // }

    List<String> list = new ArrayList<String>();
    
    // for문의 경우
    for(int j = 0; j < list.size; j++){
        System.out.println(list.get(j));
    }

    // 확장 for문의 경우
    for(String str : list){
        System.out.println(str);
    }

}
