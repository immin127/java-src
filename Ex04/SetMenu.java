package Ex04;

public class SetMenu {
    String name; // 이름
    Menu sandwich;
    Menu drink;

    public SetMenu(String name, Menu sandwich, Menu drink){
        this.name = name;
        this.sandwich = sandwich;
        this.drink = drink;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println("---");
        sandwich.display();
        drink.display();
        System.out.println("---");

        int price = (int)((sandwich.price + drink.price) * 0.8); // 샌드위치와 음료를 주문하면 20% 할인
        System.out.println("세트 가격 : " + price + " 원");
    }
}
