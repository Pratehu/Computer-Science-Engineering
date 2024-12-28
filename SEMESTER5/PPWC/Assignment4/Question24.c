#include <stdio.h>
#include <string.h>

void reverseString(char *str) {
    char *start = str;
    char *end = str + strlen(str) - 1;
    char temp;
    
    // Swap characters from the start and end of the string
    while (start < end) {
        // Swap the characters
        temp = *start;
        *start = *end;
        *end = temp;
        
        // Move the pointers closer to the center
        start++;
        end--;
    }
}

int main() {
    char str[100];
    
    // Input the string
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);  // Using fgets to allow spaces in the input
    str[strcspn(str, "\n")] = '\0';  // Remove the newline character if present
    
    // Call the function to reverse the string
    reverseString(str);
    
    // Output the reversed string
    printf("Reversed string: %s\n", str);
    
    return 0;
}

//Output:
//Enter a string: pragyan
//Reversed string: naygarp