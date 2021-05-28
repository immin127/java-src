package Ex07.Fraction;

public class Fraction2 extends Fraction{
    //생성자는 상속되지 않음
    Fraction2(){
        numerator = 0;
        denominator = 1;
    }

    Fraction2(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void add(Fraction2 f){
        numerator = numerator * f.denominator + denominator *f.numerator;
        denominator = denominator *f.denominator;
    }

    void add(int n){
        numerator = numerator + denominator * n;
    }
}
