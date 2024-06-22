
import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static void countDigitFrequency(int number) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        while (number != 0) {
            int digit = number % 10;
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
            number /= 10;
        }

        System.out.println("Digit frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }

    public static void main(String[] args) {
        int inputNumber = 122334455;
        countDigitFrequency(inputNumber);
    }
}
