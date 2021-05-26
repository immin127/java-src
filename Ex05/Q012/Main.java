package Ex05.Q012;

public class Main {
    public static void main(String[] args) {
        //Hero h = new Hero("홍길동", 100);
        Hero h = new Hero();

        h.name = "홍길동";
        h.hp = 100;


        System.out.println(h.toString());
    }
}
