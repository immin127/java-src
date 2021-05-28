package Ex06.method;

public class PowerTest {
    static void power(double m, int n){
        double ans = 1.0;
        for(int i=0; i<n; i++){
            ans *= m;
        }
        System.out.println(m + "의 " + n + "승 = " + ans);
    }

    public static void main(String[] args) {
        power(2.7, 8);
        power(18.9, 4);
    }
}
