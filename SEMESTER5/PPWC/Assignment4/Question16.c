#include <stdio.h>

int main() {
    // Declare the arrays and the result array
    int a[] = {1, 2, 3, 4, 5};
    int b[] = {6, 7, 8, 9, 10};
    int c[] = {11, 12, 13, 14, 15};
    int d[] = {16, 17, 18, 19, 20};
    int sumarr[5];

    // Declare an array of pointers to hold the addresses of the arrays
    int *arr[4];
    arr[0] = a; // Pointer to array `a`
    arr[1] = b; // Pointer to array `b`
    arr[2] = c; // Pointer to array `c`
    arr[3] = d; // Pointer to array `d`

    // Compute the element-wise sum into `sumarr`
    for (int i = 0; i < 5; i++) {
        sumarr[i] = *(arr[0] + i) + *(arr[1] + i) + *(arr[2] + i) + *(arr[3] + i);
    }

    // Display the result
    printf("Element-wise sum of the arrays:\n");
    for (int i = 0; i < 5; i++) {
        printf("sumarr[%d] = %d\n", i, sumarr[i]);
    }

    return 0;
}

//Output:
//Element-wise sum of the arrays:
//sumarr[0] = 34
//sumarr[1] = 38
//sumarr[2] = 42
//sumarr[3] = 46
//sumarr[4] = 50