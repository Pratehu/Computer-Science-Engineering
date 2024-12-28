#include <stdio.h>
#include <string.h>

#define ASCII_SIZE 256 // Total ASCII characters

// Function to find the first repetitive character in a string
char findFirstRepetitiveChar(char str[]) {
    int char_count[ASCII_SIZE] = {0}; // Array to store character counts

    for (int i = 0; str[i] != '\0'; i++) {
        char_count[(int)str[i]]++; // Increment the count for the character

        // Check if this character has occurred before
        if (char_count[(int)str[i]] > 1) {
            return str[i]; // Return the first repetitive character
        }
    }

    return '\0'; // Return null character if no repetition
}

int main() {
    char str[100];

    // Input the string
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    str[strcspn(str, "\n")] = '\0'; // Remove the newline character

    // Find the first repetitive character
    char result = findFirstRepetitiveChar(str);

    // Output the result
    if (result != '\0') {
        printf("The first repetitive character in the string \"%s\" is '%c'.\n", str, result);
    } else {
        printf("No repetitive character found in the string \"%s\".\n", str);
    }

    return 0;
}


//Output:
//Enter a string: pragyan
//The first repetitive character in the string "pragyan" is 'a'.