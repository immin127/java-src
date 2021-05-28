package Ex07.Test.ex02;

public class MagicFigther extends Fighter{
    int mp;

    
    public MagicFigther() {
        name = "마법사";
        mp = 10;
    }
    public void attack(){
        System.out.println(name+" 공격");
        System.out.println("적에게 " + (atk + mp) + "데미지");
    }
}
