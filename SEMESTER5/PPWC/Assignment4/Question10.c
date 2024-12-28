#include <stdio.h>

int main() {
    // Declare and initialize the array a
    int a[] = {120, 502, 118, 188, 106, 447};

    // Declare pointer variables pointing to elements of the array a
    int *ptr1 = &a[0];
    int *ptr2 = &a[1];
    int *ptr3 = &a[2];
    int *ptr4 = &a[3];
    int *ptr5 = &a[4];
    int *ptr6 = &a[5];

    // Print the array content using pointers
    printf("Array content using pointers:\n");
    printf("Index 0: Value = %d, Address = %p\n", *ptr1, (void*)ptr1);
    printf("Index 1: Value = %d, Address = %p\n", *ptr2, (void*)ptr2);
    printf("Index 2: Value = %d, Address = %p\n", *ptr3, (void*)ptr3);
    printf("Index 3: Value = %d, Address = %p\n", *ptr4, (void*)ptr4);
    printf("Index 4: Value = %d, Address = %p\n", *ptr5, (void*)ptr5);
    printf("Index 5: Value = %d, Address = %p\n", *ptr6, (void*)ptr6);

    return 0;
}

//Output:
//Array content using pointers:
//Index 0: Value = 120, Address = 000000000061fde0
//Index 1: Value = 502, Address = 000000000061fde4
//Index 2: Value = 118, Address = 000000000061fde8
//Index 3: Value = 188, Address = 000000000061fdec
//Index 4: Value = 106, Address = 000000000061fdf0
//Index 5: Value = 447, Address = 000000000061fdf4