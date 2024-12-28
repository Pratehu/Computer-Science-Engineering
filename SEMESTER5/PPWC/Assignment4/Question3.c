#include <stdio.h>

// Define the structure
struct MyStructure {
    float x;
    float y;
    float z;
};

int main() {
    // Declare and initialize a structure variable
    struct MyStructure var = {1.0, 6.7, 2.3};

    // Declare a pointer to the structure and assign it the address of var
    struct MyStructure *p = &var;

    // Display the values of x, y, and z using the pointer p
    printf("Value of x: %.2f\n", p->x);
    printf("Value of y: %.2f\n", p->y);
    printf("Value of z: %.2f\n", p->z);

    return 0;
}

//Output:
//Value of x: 1.00
//Value of y: 6.70
//Value of z: 2.30