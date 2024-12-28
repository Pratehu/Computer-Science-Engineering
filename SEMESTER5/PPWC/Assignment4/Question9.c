#include <stdio.h>

int main() {
    // Declare and initialize the integer array
    int intArray[] = {10, 13, 20, 33, 44};
    
    // Declare and initialize the float array
    float floatArray[] = {10.2, 13.3, 20.0, 33.3, 45.3, 89.9};
    
    // Print values and addresses for the integer array using pointers
    printf("Integer Array Values and Addresses:\n");
    for (int i = 0; i < 5; i++) {
        printf("Value = %d, Address = %p\n", *(intArray + i), (void*)(intArray + i));
    }
    
    // Print values and addresses for the float array using pointers
    printf("\nFloat Array Values and Addresses:\n");
    for (int i = 0; i < 6; i++) {
        printf("Value = %.1f, Address = %p\n", *(floatArray + i), (void*)(floatArray + i));
    }

    return 0;
}


//Output:
//Integer Array Values and Addresses:
//Value = 10, Address = 000000000061fe10
//Value = 13, Address = 000000000061fe14
//Value = 20, Address = 000000000061fe18
//Value = 33, Address = 000000000061fe1c
//Value = 44, Address = 000000000061fe20

//Float Array Values and Addresses:
//Value = 10.2, Address = 000000000061fdf0
//Value = 13.3, Address = 000000000061fdf4
//Value = 20.0, Address = 000000000061fdf8
//Value = 33.3, Address = 000000000061fdfc
//Value = 45.3, Address = 000000000061fe00
//Value = 89.9, Address = 000000000061fe04