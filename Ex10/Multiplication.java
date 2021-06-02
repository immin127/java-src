package Ex10;

public class Multiplication {
    int dn;
    int time;
    
    Multiplication(int d, int t){
        dn = d;
        time = t;
    }

    void start(){
        for(int i = 1; i <= 9; i++) {
            System.out.print(dn * i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println();
            }
            System.out.println();
        }
    }
}
