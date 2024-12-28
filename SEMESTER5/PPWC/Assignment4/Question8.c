#include <stdio.h>

int main() {
    // Declare and initialize the array a
    int a[10] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

    // Loop through the array and print the address and value of each element
    for (int i = 0; i < 10; i++) {
        printf("Index %d, Value = %d, Address = %p\n", i, a[i], (void*)&a[i]);
    }

    return 0;
}

//Output:
//Index 0, Value = 0, Address = 000000000061fe00
//Index 1, Value = 10, Address = 000000000061fe04
//Index 2, Value = 20, Address = 000000000061fe08
//Index 3, Value = 30, Address = 000000000061fe0c
//Index 4, Value = 40, Address = 000000000061fe10
//Index 5, Value = 50, Address = 000000000061fe14
//Index 6, Value = 60, Address = 000000000061fe18
//Index 7, Value = 70, Address = 000000000061fe1c
//Index 8, Value = 80, Address = 000000000061fe20
//Index 9, Value = 90, Address = 000000000061fe24