package Ex07.Test.ex01;

public class Main {
    public static void main(String[] args) {
        Employee taro = new Employee();
        taro.name = "홍길동";

        Manager hanako = new Manager();
        hanako.name = "이순신";

        taro.Operation();
        hanako.Operation();
        hanako.Management();
    }
}
