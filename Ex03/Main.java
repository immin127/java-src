package Ex03;

public class Main {
    public static void main(String[] args) {
        Shop s1 = new Shop("A매장", 1500000);
        Shop s2 = new Shop("B매장", 1800000);
        Shop s3 = new Shop();

        s1.display();
        s2.display();
        s3.display();
    }
}
