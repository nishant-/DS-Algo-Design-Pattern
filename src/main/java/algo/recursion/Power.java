package algo.recursion;

/*
* find x^y recursively
* */

public class Power {

    private static final long power(int base, int exponent) {

        if (exponent < 0)
            throw new IllegalArgumentException("Negative exponent not supported");
        if (exponent == 0 || base == 1)
            return 1;
        return base * power(base, exponent - 1);

    }

    public static void main(String[] args) {

        System.out.println(power(2, 0));
    }
}
