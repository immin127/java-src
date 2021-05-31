package Ex08;

public class StaticClasses {
    static class Inner1 {
        static final String greet = "안녕하세요.";
        static void sayHello(){
            System.out.println(greet);
        }
    }
    class Inner2 {
        String greet = "Hello";
        void sayHello(){
            System.out.println(greet);
        }
    }
}
