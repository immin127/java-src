package Ex06.Test.ex03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> score = new HashMap<>();
        

        score.put("국어", 90);
        score.put("수학", 80);
        score.put("영어", 70);

        for(String key : score.keySet()){
            System.out.println(key + " : " + score.get(key) + "점");
        }
    }
}
