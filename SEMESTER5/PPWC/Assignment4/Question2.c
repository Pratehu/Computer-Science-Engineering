#include <stdio.h>

int main() {
    // Declare two integer variables and assign values to them
    int a = 10, b = 20;

    // Print the values and addresses before swap
    printf("Before Swap:\n");
    printf("Value of a: %d, Address of a: %p\n", a, (void*)&a);
    printf("Value of b: %d, Address of b: %p\n", b, (void*)&b);

    // Swap the contents of a and b
    int temp = a;
    a = b;
    b = temp;

    // Print the values and addresses after swap
    printf("\nAfter Swap:\n");
    printf("Value of a: %d, Address of a: %p\n", a, (void*)&a);
    printf("Value of b: %d, Address of b: %p\n", b, (void*)&b);

    // Check whether the addresses are the same before and after the swap
    if (&a == &b) {
        printf("\nThe addresses of a and b are the same before and after the swap.\n");
    } else {
        printf("\nThe addresses of a and b are different before and after the swap.\n");
    }

    return 0;
}


//Output:
//Before Swap:
//Value of a: 10, Address of a: 000000000061fe28
//Value of b: 20, Address of b: 000000000061fe24

//After Swap:
//Value of a: 20, Address of a: 000000000061fe28
//Value of b: 10, Address of b: 000000000061fe24

//The addresses of a and b are different before and after the swap.