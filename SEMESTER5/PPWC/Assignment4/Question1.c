#include <stdio.h>

// Define the structure with given variables
struct MyStructure {
    int Ia;        // Integer type for the first value
    char Chvar;    // Character type for the second value
    float Fb;      // Float type for the third value
    char Z;        // Character type for the fourth value
};

int main() {
    // Declare a structure variable and initialize it with values
    struct MyStructure var = {345, 'A', 4.5, 'Z'};

    // Print the values and addresses of each variable in the structure
    printf("Value of Ia: %d, Address of Ia: %p\n", var.Ia, (void*)&var.Ia);
    printf("Value of Chvar: %c, Address of Chvar: %p\n", var.Chvar, (void*)&var.Chvar);
    printf("Value of Fb: %.2f, Address of Fb: %p\n", var.Fb, (void*)&var.Fb);
    printf("Value of Z: %c, Address of Z: %p\n", var.Z, (void*)&var.Z);

    return 0;
}

//Output:
//Value of Ia: 345, Address of Ia: 000000000061fe20
//Value of Chvar: A, Address of Chvar: 000000000061fe24
//Value of Fb: 4.50, Address of Fb: 000000000061fe28
//Value of Z: Z, Address of Z: 000000000061fe2c