public class Q1 {
    public static int countSetBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 25;
        int result = countSetBits(num);
        System.out.println("Number of bits set to 1 in " + num + " = " + result);
    }
}
