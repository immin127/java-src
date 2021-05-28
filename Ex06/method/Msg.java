package Ex06.method;

public class Msg {
    static void msg(){
        System.out.println("Hello");
    }
    static void msg2(){
        System.out.println("Good Bye");
    }
    public static void main(String[] args) {
        System.out.println("*** top ***");
        msg();
        System.out.println("*** middle ***");
        msg();
        System.out.println("end");
        msg2();
    }
}
