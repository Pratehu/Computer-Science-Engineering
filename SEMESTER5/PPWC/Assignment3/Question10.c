#include <stdio.h>
#include <string.h>
#include <math.h>

// Function to convert binary to hexadecimal
void binaryToHexadecimal(char binary[], char hex[]) {
    int len = strlen(binary);
    int hexIndex = 0;

    // Ensure the binary length is a multiple of 4
    int padding = 4 - (len % 4);
    if (padding != 4) {
        for (int i = len; i >= 0; i--) {
            binary[i + padding] = binary[i];
        }
        for (int i = 0; i < padding; i++) {
            binary[i] = '0';
        }
        len += padding;
    }

    binary[len] = '\0'; // Null terminate the padded binary string

    // Convert each group of 4 bits to a hexadecimal digit
    for (int i = 0; i < len; i += 4) {
        int value = 0;
        for (int j = 0; j < 4; j++) {
            value = value * 2 + (binary[i + j] - '0');
        }

        if (value < 10) {
            hex[hexIndex++] = '0' + value;
        } else {
            hex[hexIndex++] = 'A' + (value - 10);
        }
    }

    hex[hexIndex] = '\0'; // Null terminate the hex string
}

int main() {
    char binary[100], hex[25];

    // Input binary number
    printf("Enter a binary number: ");
    scanf("%s", binary);

    // Convert binary to hexadecimal
    binaryToHexadecimal(binary, hex);

    // Output the result
    printf("The hexadecimal equivalent is: %s\n", hex);

    return 0;
}

//Output:
//Enter a binary number: 1011
//The hexadecimal equivalent is: B