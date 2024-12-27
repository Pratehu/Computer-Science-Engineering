#include <stdio.h>

int main() {
    char choice;

    // Input the character choice
    printf("Enter the choice of the character: ");
    scanf(" %c", &choice);

    // Validate input
    if (choice < 'A' || choice > 'Z') {
        printf("Invalid input! Please enter an uppercase alphabet (A-Z).\n");
        return 1;
    }

    int rows = choice - 'A' + 1; // Number of rows is based on the character

    // Outer loop for each row
    for (int i = 0; i < rows; i++) {
        // Print the left side of the pattern
        for (int j = 0; j < rows - i; j++) {
            printf("%c ", 'A' + j);
        }

        // Print spaces in the middle
        for (int j = 0; j < 2 * i - 1; j++) {
            printf("  ");
        }

        // Print the right side of the pattern
        for (int j = rows - i - 1; j >= 0; j--) {
            if (i == 0 && j == rows - i - 1) // Avoid printing twice on the first row
                continue;
            printf("%c ", 'A' + j);
        }

        printf("\n"); // Move to the next row
    }

    return 0;
}

//Ouput:
//A B C D E F G F E D C B A
//A B C D E F   F E D C B A 
//A B C D E       E D C B A
//A B C D           D C B A
//A B C               C B A
//A B                   B A 
//A                       A