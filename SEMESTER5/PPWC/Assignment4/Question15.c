#include <stdio.h>

int main() {
    // Declare ordinary variables
    int a, b, c, d;
    
    // Declare a pointer array to hold the addresses of variables
    int *arr[4];
    
    // Initialize values using their respective pointers
    arr[0] = &a;
    arr[1] = &b;
    arr[2] = &c;
    arr[3] = &d;

    *arr[0] = 55; // Assign 55 to a
    *arr[1] = 105; // Assign 105 to b
    *arr[2] = 89; // Assign 89 to c
    *arr[3] = 68; // Assign 68 to d

    // Declare a variable to store the maximum value
    int maxvar = *arr[0]; // Initialize with the value of `a`

    // Find the maximum using pointer manipulation
    for (int i = 1; i < 4; i++) {
        if (*arr[i] > maxvar) {
            maxvar = *arr[i];
        }
    }

    // Display the results
    printf("Values:\n");
    printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
    printf("Maximum value: %d\n", maxvar);

    return 0;
}

//Output:
//Values:
//a = 55, b = 105, c = 89, d = 68
//Maximum value: 105