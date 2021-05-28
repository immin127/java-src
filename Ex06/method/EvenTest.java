package Ex06.method;

public class EvenTest {
    static boolean isEven(int n){
        if(n % 2 == 0){
            return true; //  
        }
        return false; // 
    }

    public static void main(String[] args) {
        int a =3, b = 4;

        System.out.println(a + "는");
        if(isEven(a)){
            System.out.println(" 짝수입니다.");
        } else {
            System.out.println(" 홀수입니다.");
        }

        System.out.println(b + "는");
        if(isEven(b)){
            System.out.println(" 짝수입니다.");
        } else {
            System.out.println(" 홀수입니다.");
        }
    }
}
