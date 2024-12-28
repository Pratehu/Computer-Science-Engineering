#include <stdio.h>

// Define the structure
struct MyStructure {
    int a;
    int b;
    int c;
};

int main() {
    // Declare and initialize a structure variable
    struct MyStructure var = {12, 52, 8};

    // Declare pointer variables for a, b, and c
    int *ptr1 = &var.a;  // Pointer to a
    int *ptr2 = &var.b;  // Pointer to b
    int *ptr3 = &var.c;  // Pointer to c

    // Print values before incrementing
    printf("Before incrementing:\n");
    printf("a = %d, b = %d, c = %d\n", var.a, var.b, var.c);

    // Increment the values of a, b, and c by 10 using the pointers
    *ptr1 += 10;  // Increment value of a
    *ptr2 += 10;  // Increment value of b
    *ptr3 += 10;  // Increment value of c

    // Print updated values
    printf("\nAfter incrementing by 10:\n");
    printf("a = %d, b = %d, c = %d\n", var.a, var.b, var.c);

    return 0;
}

//Output:
//Before incrementing:
//a = 12, b = 52, c = 8

//After incrementing by 10:
//a = 22, b = 62, c = 18