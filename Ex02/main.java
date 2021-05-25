package Ex02;

public class main {
    public static void main(String[] args) {
        Student [] students = new Student [3];

        students [0] = new Student("홍길동", 90, 75, 50);
        students [1] = new Student("홍길동", 90, 75, 50);
        students [2] = new Student("홍길동", 90, 75, 50);

        System.out.println("성적표");

        for(int i =0; i < students.length; i++){
            students[i].show();

        }
        
    }
}
