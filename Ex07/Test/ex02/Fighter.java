package Ex07.Test.ex02;

public class Fighter {
    String name;
    int atk;

    
    public Fighter() {
        name = "전사";
        atk = 10;
    }

    public void attack(){
        System.out.println(name+"공격!");
        System.out.println(atk+"데미지");
    }
}
