package Ex05;

public class Q013 {
    public static void main(String[] args) {
        // String s10 = "10";
        // Integer num = Integer.parseInt(s10);
        // System.out.println(num);
        // 

        // 문자열을 숫자로 변환
        String s10 = "10";
        Integer num = Integer.parseInt(s10);
        
        System.out.println(num);

        // 숫자를 문자로 변환
        int i = 20;
        String str = String.valueOf(i); //valueOf 메소드는 Long클래스에서 가져옴.
        System.out.println(str);
    }


}
