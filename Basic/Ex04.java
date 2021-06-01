package Basic;

public class Ex04 {
    public static void main(String[] args) {
        // if문

        // if(조건1) {
        //     조건1이 true이면 처리
        // } else if(조건2) {
        //     조건2가 true이면 처리
        // } else {
        //     그 이외의 경우 처리
        // }

        int i = 10;
        // i가 10보다 작을 경우
        if(i < 10) {
            System.out.println("10보다 작다");
            
        // 그 이외의 경우
        } else {
            System.out.println("10 이상");
        }
        

        // else는 생략이 가능
        if(i < 10){
            System.out.println("10보다 작다");
        }

        // 조건이 복수의 경우 최초에 true가 된 1블록만을 실행한다.
        if(i < 20 && i % 2 == 0){
            System.out.println("20보다 작은 짝수"); //실행
        } else if(i < 20) {
            System.out.println("20보다 작다"); // 실행 X
        } else {
            System.out.println("그 이외"); // 실행 X
        }
        
    }
}
