package lab5;



public class Q2 {
    public static void main(String[] args) {
        String inputString = "a2b3c4ded";
        try {
            if (inputString == null || inputString.isEmpty()) {
                throw new NullPointerException("Input string is null or empty");
            }
            
            boolean foundNumeric = false;
            for (int i = 0; i < inputString.length() - 2; i++) {
                char currentChar = inputString.charAt(i);
                char nextChar = inputString.charAt(i + 1);
                char nextNextChar = inputString.charAt(i + 2);
                
                if (isVowel(currentChar) && Character.isAlphabetic(nextChar) && Character.isDigit(nextNextChar)) {
                    System.out.println("Numeric character: " + nextNextChar);
                    foundNumeric = true;
                }
            }
            
            if (!foundNumeric) {
                System.out.println("No numeric characters preceded by a vowel and consonant found.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

