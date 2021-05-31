package Ex08;

public class StaticClassesExam {
    public static void main(String[] args) {
        StaticClasses sc = new StaticClasses();

        StaticClasses.Inner1 si1 = new StaticClasses.Inner1();
        si1.sayHello();

        StaticClasses.Inner1 si2 = new Inner2();
        si2.sayHello();
    }
}
