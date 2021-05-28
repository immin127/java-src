package Ex06.method;

public class Max5 {
    static int max(int a, int b){
        System.out.println("int형 max()메소드");
        if( a > b){
            return a;
        }
        return b;
    }

    static double max(double a, double b){
        System.out.println("double형 max()메소드");
        if(a > b){
            return a;
        }
        return b;
    }
    static int max(int a, int b, int c){
        System.out.println("int형 3개 max()메소드");
        if(a>b){
            if(a>c){
                return a;
            } else {
                return c;
            }   
        } else {
            if(b > c){
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(max(-3, -4));
        System.out.println(max(1.23, 4.56));
        System.out.println(max(-3, 0, 3));
    }
}
