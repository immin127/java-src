package Ex05.Q010;

public class Hero {
    String name;
    int hp;

    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString(){
        return "이름 : " + name + " 체력 : " + hp; 
    }
}
