public class Q6 {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long dividendPositive = Math.abs((long) dividend);
        long divisorPositive = Math.abs((long) divisor);

        long quotient = 0;
        for (int i = 31; i >= 0; i--) {
            if ((dividendPositive >= (divisorPositive << i))) {
                dividendPositive -= (divisorPositive << i);
                quotient |= (1L << i);
            }
        }

        if (sign < 0) {
            quotient = -quotient;
        }

        if (quotient > Integer.MAX_VALUE || quotient < Integer.MIN_VALUE) {
            throw new ArithmeticException("Result out of range for integer");
        }

        return (int) quotient;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 4;

        int result = divide(x, y);
        System.out.println(x + " / " + y + " = " + result);
    }
}
