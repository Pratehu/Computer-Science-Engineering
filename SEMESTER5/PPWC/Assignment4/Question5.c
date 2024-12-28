#include <stdio.h>

// Define the structure with members a, b, and c
struct MyStructure {
    int a;
    int b;
    int c;
};

int main() {
    // Declare and initialize a structure variable with the values for a, b, and c
    struct MyStructure var = {12, 25, 18};

    // Declare a pointer variable ptr that points to the structure
    struct MyStructure *ptr = &var;

    // Print the values before increment
    printf("Before incrementing:\n");
    printf("a = %d, b = %d, c = %d\n", ptr->a, ptr->b, ptr->c);

    // Increment the values of a, b, and c by 10 using the pointer
    ptr->a += 10;
    ptr->b += 10;
    ptr->c += 10;

    // Print the updated values after increment
    printf("\nAfter incrementing by 10:\n");
    printf("a = %d, b = %d, c = %d\n", ptr->a, ptr->b, ptr->c);

    return 0;
}

//Output:
//Before incrementing:
//a = 12, b = 25, c = 18

//After incrementing by 10:
//a = 22, b = 35, c = 28
