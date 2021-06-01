package Ex09.Test.Exception;

public class ExamMain {
    public static void main(String[] args) {
        try {
            Exam ex = new Exam();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류 발생");
        }
    }
}
