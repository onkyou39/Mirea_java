import static java.lang.Double.valueOf;

public class Shell {
    public static void main(String[] args) {
        Double a2 = valueOf("3.38");
        Double a1 = valueOf("5.86");
        String b2 = "3.14";
        double b1 = Double.parseDouble(b2);

        System.out.println(a1);
        int i = a1.intValue();
        System.out.println(i);
        long l = a1.longValue();
        System.out.println(l);
        short s = a1.shortValue();
        System.out.println(s);
        byte b = a1.byteValue();
        System.out.println(b);
        float f = a1.floatValue();
        System.out.println(f);

        String d = Double.toString(b1);
        System.out.println(d);
    }
}
