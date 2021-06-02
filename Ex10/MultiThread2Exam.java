package Ex10;

public class MultiThread2Exam {
    public static void main(String[] args) {
        MultiThread2 a = new MultiThread2("A", 500);
        MultiThread2 b = new MultiThread2("\tB", 700);
        MultiThread2 c = new MultiThread2("\t\tC", 1100);

        a.start();
        b.start();
        c.start();
    }
}
