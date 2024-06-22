public class Q2 {
    public static int countSetBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static int calculateParity(int number) {
        int count = countSetBits(number);
        return count % 2;
    }

    public static void main(String[] args) {
        int num = 25;
        int parity = calculateParity(num);

        System.out.println("Parity of " + num + " = " + parity);
    }
}
