public class Q3 {
    public static int swapBits(int number, int i, int j) {
      
        int bitI = (number >> i) & 1;
        int bitJ = (number >> j) & 1;

        
        if (bitI != bitJ) {
            
            int maskI = 1 << i;
            int maskJ = 1 << j;

            
            number = number ^ maskI;
            number = number ^ maskJ;
        }

        return number;
    }

    public static void main(String[] args) {
        int num = 28; 
        int i = 1;    
        int j = 3;

        System.out.println("Before swapping: " + Integer.toBinaryString(num));
        int result = swapBits(num, i, j);
        System.out.println("After swapping:  " + Integer.toBinaryString(result));
    }
}
