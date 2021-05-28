package Ex07.Test.ex04;

public class RectAngle {
    int width;
    int height;

    RectAngle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void getFill(){
        System.out.println(width * height);
        return;
    }
}
