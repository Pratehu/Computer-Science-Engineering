// Write a java program to print the following structure (using loop)
// A
// B C
// D E F
// G H I J
// K L M N O
// P Q R S 
// T U V
// W X 
// Y
public class SetCQ2 {
	

    public static void main(String[] args) {
        int rowCount = 1;
        char currentChar = 'A';

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
            rowCount++;
        }
    }
}




 

