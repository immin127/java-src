package Ex06.method;

public class GCDExam {
    static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        if(a%b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println("1071과 1029 최대공약수: " + gcd(1071, 1029));
    }
}
