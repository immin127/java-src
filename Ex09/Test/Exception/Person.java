package Ex09.Test.Exception;

public class Person {
    
    static void set(int i) throws IllegalStateException{
        if(i < 0){
            throw new IllegalStateException("정수가 없음");
        }
    }

}
