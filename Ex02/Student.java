package Ex02;

public class Student {
    private String name;
    private int kor, mat, eng;

    //생성자1
    public Student(String name, int kor, int mat, int eng){
        super();
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;

    }
    public Student(String name){
        this(name, 0, 0, 0);
    }

    public void show(){
        System.out.println(name + " : " + kor + ", " + mat + ", " + eng);
    }

}
