package Ex06.method;

public class Max4 {
    static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    static double max(double a, double b){
        System.out.println("double형 max() 메소드");
        if(a>b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(max(-3, -4));
        System.out.println(max(1.23, 4.56));
    }
}
