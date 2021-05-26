package Ex05;

public class Q007 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int sum = 1;
        for(int i = 0; i < b; i++){
            sum *= a;
        }
        System.out.println(a + "의 " + b + "제곱은 " + sum + "입니다.");
    }
}
