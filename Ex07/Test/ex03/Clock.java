package Ex07.Test.ex03;

public class Clock {
    String time;

    Clock(){
    }
    Clock(String time){
        this.time = time;
    }

    public void showTime(){
        System.out.println(time + " 입니다.");
    }
}
