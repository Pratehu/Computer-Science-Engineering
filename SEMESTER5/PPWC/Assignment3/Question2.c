#include <stdio.h>

// Function prototype
void sumarr(int a[], int b[], int r[], int size);

// Main function to demonstrate the usage of sumarr
int main() {
    int a[] = {5, -1, 7}; // Input array 1
    int b[] = {2, 4, -2}; // Input array 2
    int size = 3;         // Size of the arrays
    int r[size];          // Output array

    // Call the function
    sumarr(a, b, r, size);

    // Print the resultant array
    printf("Resultant array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", r[i]);
    }

    return 0;
}

// Function definition
void sumarr(int a[], int b[], int r[], int size) {
    for (int i = 0; i < size; i++) {
        r[i] = a[i] + b[i]; // Summing corresponding elements
    }
}


//Output:
//Resultant array: 7 3 5