package Ex09.Test;

public class Ex01 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
