#include <stdio.h>

int main() {
    int number;

    // Input the number from the user
    printf("Enter the number > ");
    scanf("%d", &number);

    // Validate input
    if (number <= 0) {
        printf("Please enter a positive number greater than 0.\n");
        return 1;
    }

    // Print the top border of the table
    printf("+-----------------------------------------+\n");

    // First row: Multiples of the given number
    for (int i = 1; i <= 10; i++) {
        printf("  |");
        printf("%d ", number * i); // Print the multiplication result
    }
    printf("|\n");

    // Second row: The numbers 1 to 10
    for (int i = 1; i <= 10; i++) {
        printf("  |");
        printf("%d ", i); // Print numbers from 1 to 10
    }
    printf("|\n");

    // Third row: A sequence of the given number repeated 10 times
    for (int i = 1; i <= 10; i++) {
        printf("  |");
        printf("%d ", number); // Print the number itself 10 times
    }
    printf("|\n");

    // Print the bottom border of the table
    printf("+-----------------------------------------+\n");

    return 0;
}

//Ouput:
//Enter the number > 70
//+-----------------------------------------+
//  |70   |140   |210   |280   |350   |420   |490   |560   |630   |700 |
//  |1   |2   |3   |4   |5   |6   |7   |8   |9   |10 |
//  |70   |70   |70   |70   |70   |70   |70   |70   |70   |70 |
//+-----------------------------------------+
