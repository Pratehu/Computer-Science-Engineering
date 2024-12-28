#include <stdio.h>
#include <ctype.h> // For toupper()

int main() {
    // Define the strings
    char str1[] = "mine";
    char str2[] = "cs";
    char str3[] = "oa";

    // Create the argument array (array of pointers to strings)
    char *argv[] = {str1, str2, str3, NULL}; // NULL marks the end

    // Convert each string to uppercase using pointers
    for (int i = 0; argv[i] != NULL; i++) {
        char *ptr = argv[i];
        while (*ptr) {
            *ptr = toupper(*ptr); // Convert each character to uppercase
            ptr++; // Move to the next character
        }
    }

    // Display the strings
    printf("Strings after conversion to uppercase:\n");
    for (int i = 0; argv[i] != NULL; i++) {
        printf("%s\n", argv[i]);
    }

    return 0;
}

//Output:
//Strings after conversion to uppercase:
//MINE
//CS
//OA