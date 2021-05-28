package Ex06.method;

public class SixMsg3 {
    static void msg(int n){
        for(int i=0; i<n; i++){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        System.out.println("***top***");
        msg(2);
        System.out.println("***middle***");
        msg(4);
        System.out.println("****end****");
    }
}
