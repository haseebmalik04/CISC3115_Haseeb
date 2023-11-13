public class Rational_HW8 extends Number implements Comparable<Rational_HW8> {

    private long numerator;
    private long denominator;

    public Rational_HW8() {
        this(0, 1);
    }

    //Need to further check
    public Rational_HW8(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational_HW8 add(Rational_HW8 second) {
        return new Rational_HW8(numerator * second.getDenominator() + denominator * second.getNumerator(), denominator * second.getDenominator());
    }

    public Rational_HW8 subtract(Rational_HW8 second) {
        return new Rational_HW8(numerator * second.getDenominator() - denominator * second.getNumerator(),denominator * second.getDenominator());
    }

    public Rational_HW8 multiply(Rational_HW8 second) {
        return new Rational_HW8(numerator * second.getNumerator(), denominator * second.getDenominator());
    }

    public Rational_HW8 divide(Rational_HW8 second) {
        return new Rational_HW8(numerator * second.getDenominator(), denominator * second.getNumerator());
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return "Rational: " + numerator;
        else
            return numerator + "/" + denominator;
    }


    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);

        while (n2 != 0) {
            long temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    //1 means this is greater, -1 means this is smaller, 0 means equal
    @Override
    public int compareTo(Rational_HW8 o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }

}