package Ex06.method;

public class MaxValue {
    static void max(int x, int y){
        if(x > y){
            System.out.println(y + "보다" + x + "가 큽니다.");
        } else{
            System.out.println(x + "보다" + y + "가 큽니다.");    
        }
    }
    public static void main(String[] args) {
        max(3, 4);
        max(-2, -5);
    }
}
