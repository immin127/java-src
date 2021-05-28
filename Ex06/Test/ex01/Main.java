package Ex06.Test.ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("체리");
        list.add("쥬빌레");
        list.add("민초");
        list.add("봉봉");

        // for(int i=0; i<f.size(); i++){
        //     System.out.println(f.get(i));
        // }
        for(String data : list ){
            System.out.println(data);
        }
    }
}
