package Ex04;

public class Main {
    public static void main(String[] args) {
        Menu snadwitch = new Menu("햄버거", 1500);
        Menu drink = new Menu("콜라", 1000);
        SetMenu burgerset = new SetMenu("햄버거 세트", snadwitch, drink);

        burgerset.display();
    }
}
