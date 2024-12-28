#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define ASCII_SIZE 256 // Total ASCII characters

// Function to count the occurrences of each character
void countCharacters(char str[]) {
    int char_count[ASCII_SIZE] = {0}; // Array to store character counts

    // Count each character in the string
    for (int i = 0; str[i] != '\0'; i++) {
        char_count[(int)str[i]]++;
    }

    // Display the results
    printf("The count of each character in the string \"%s\" is:\n", str);
    for (int i = 0; i < ASCII_SIZE; i++) {
        if (char_count[i] > 0) {
            printf("%c-%d, ", (char)i, char_count[i]);
        }
    }
    printf("\b\b \n"); // Remove the trailing comma and space
}

int main() {
    char str[100];

    // Input the string
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0'; // Remove the newline character

    // Count and display the characters
    countCharacters(str);

    return 0;
}

//Output:
//Enter a string: pragyan
//The count of each character in the string "pragyan" is:
//a-2, g-1, n-1, p-1, r-1, y-1