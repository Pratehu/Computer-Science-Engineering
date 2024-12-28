#include <stdio.h>

// Define the structure
struct MyStructure {
    int x;
};

int main() {
    // Declare a structure variable and initialize its member x
    struct MyStructure var = {89};

    // Declare pointer variables p1, p2, and p3, and initialize them with the address of var
    struct MyStructure *p1 = &var;
    struct MyStructure *p2 = &var;
    struct MyStructure *p3 = &var;

    // Display the value of x from p1
    printf("Value of x from p1: %d\n", p1->x);

    // Update the value of x to 100 using pointer p3
    p3->x = 100;

    // Display the updated value of x
    printf("Updated value of x using p3: %d\n", p3->x);

    return 0;
}

//Output:
//Value of x from p1: 89
//Updated value of x using p3: 100