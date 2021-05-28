package Ex07.Test.ex03;

public class AlarmClock extends Clock{
    String alarmTime;

    AlarmClock(){
        
    }

    AlarmClock(String time){
        super(time);
    }

    public void alarm(){
        if(time == alarmTime){
            System.out.println("알람 울림!");
        }
    }

    public void setAlarm(String time){
        this.time = alarmTime;
    }
}
