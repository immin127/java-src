package Basic;

public class Ex02 {
    public static void main(String[] args) {
        // 논리연산자
        // (||)대문자와 소문자를 다른문자로 인식(->같은문자로 인식하게)
        char logic1 = 'a';
        boolean result = logic1=='A'||logic1=='a'; //->A와 a가 같니? 라고 물어봄
        System.out.println(result); // ||를 써서 A와 a를 자바가 같은 문자로 인식하게됨, ||은 or와 같음
        
        //&&숫자의 범위를 표현할때 사용
        int number=11;
        String result1=(number>0 && number<=10)?"1부터 10사이의 숫자":"1부터 10사이의 숫자가 아님";
        System.out.println(result1);
        
        //! 부정, 반대로 사용 (전원버튼에 많이 사용)
        boolean power = false;
        System.out.println(!power); //->true
        power = !power;
        System.out.println(!power); //->false
        
        String result2 = (!power==true)?"전원이 작동함":"전원이 꺼졌다.";
        System.out.println(result2);
        power=true;
        result2 = (!power==true)?"전원이 작동함":"전원이 꺼졌다.";
        System.out.println(result2);
    }


}
