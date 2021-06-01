package Basic;

public class Ex07 {
    public static void main(String[] args) {
        // while문 
        // while(조건){
        //     조건이 true인 동안 반복을 함
        // }

        // i가 5보다 작은 동안 반복을 함
        int i = 0;
        while(i < 5) {
            i = (int)(Math.random()*10);
            System.out.println(i);
        }

        // do ~ while문
        // 최소한 1회는 반드시 실행
        
        // do {
        //     조건이 true인 동안 반복을 함
        // } while(조건);

        int i2 =0;
        
        do {
            System.out.println("1회는 반드시 실행");
        } while (i2 > 0);
    }
}
