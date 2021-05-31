package Ex08;

public class WrapperClassTest {
    public static void main(String[] args) {
        byte b = 1;
        short s = 234;
        int i = 56789;
        long l = 1234567890L;
        
        char c ='A';
        float f = 1.23F;
        double d = 0.000456;

        boolean bool = true;

        Byte wrappedByte = b;
        Short wrappedShort = s;
        Integer wrappedInteger = i;
        Long wrappedLong = l;

        Float wrappedFloat = f;
        Double wrappDouble = d;
        Boolean wraBoolean = bool;
        
        System.out.println(wrappedByte.byteValue());
        System.out.println(wrappedShort.shortValue());
        System.out.println(wrappedInteger.intValue());
        System.out.println(wrappedLong.longValue());

        System.out.println(wrappedFloat.floatValue());
        System.out.println(wrappDouble.doubleValue());
        System.out.println(wraBoolean.booleanValue());

    }
}
