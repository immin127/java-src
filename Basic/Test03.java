package Basic;

public class Test03 {
    public static void main(String[] args) {
        // 형변환
        // 기본형 변환
        // 큰 범위의 형으로 변환
        int a = 10;

        long b = a;
        System.out.println(a);
        System.out.println(b);
        
        //작은 형태로 변환
        long c = 10;
        int d = (int) c;
        System.out.println(d);

        double e = 1.5;
        int f = (int) e; //소수점이 버려져 1이됨.
        System.out.println(f);

        // long g = 2147483648;
        // int h = (int) g; // 오버플로우로 - 2147483648
        // System.out.println(h);
    


    }
}
