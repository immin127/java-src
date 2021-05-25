package Ex01;

public class Item {
    private String name;
    private int price;

    public Item(){

    }
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void Display(){
        System.out.println(this.name + " : " + this.price);
    }
}
