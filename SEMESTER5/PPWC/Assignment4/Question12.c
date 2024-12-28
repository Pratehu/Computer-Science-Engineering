#include <stdio.h>

int main() {
    // Declare and initialize the array
    int a[] = {120, 502, 118, 188, 106, 447};

    // Declare a pointer and initialize it to point to the array
    int *ptr = a; // Array name `a` acts as a pointer to the first element

    // Display the array content using the pointer
    printf("Array content using pointer:\n");
    for (int i = 0; i < 6; i++) {
        printf("Index %d: Value = %d, Address = %p\n", i, *(ptr + i), (void*)(ptr + i));
    }

    return 0;
}

//Output:
//Array content using pointer:
//Index 0: Value = 120, Address = 000000000061fe00
//Index 1: Value = 502, Address = 000000000061fe04
//Index 2: Value = 118, Address = 000000000061fe08
//Index 3: Value = 188, Address = 000000000061fe0c
//Index 4: Value = 106, Address = 000000000061fe10
//Index 5: Value = 447, Address = 000000000061fe14