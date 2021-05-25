package Ex03;

public class Shop {
    String name;
    int sales;

    public Shop(String name, int sales){
        this.name = name;
        this.sales = sales;
    }
    // 생성자 오버로드
    public Shop(){
        this("오픈예정", 0);
    }

    public void display(){
        System.out.println(this.name + " : 매출" + this.sales + "원");
    }
}
