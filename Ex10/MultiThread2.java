package Ex10;

public class MultiThread2 extends Thread {
    int time;

    MultiThread2(String str, int t) {
        super(str);
        time = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("No. " + i + " : " + Thread.currentThread().getName()); // 스레드명 알아보기
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {

            }
        }
    }
}
