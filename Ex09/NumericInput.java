package Ex09;

import java.util.Scanner;

public class NumericInput {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int price = sin.nextInt();
        double taxRate = sin.nextDouble();

        System.out.println("부가세포함 " + price * (1+taxRate) + "원");
    }
}
