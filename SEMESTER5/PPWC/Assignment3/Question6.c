#include <stdio.h>
#include <stdbool.h>

// Function prototypes
void difference(int p[], int size_p, int q[], int size_q, int result[], int *result_size);
bool isElementInArray(int arr[], int size, int element);

int main() {
    int p[] = {1, 2, 3, 4}; // First array
    int q[] = {2, 4, 5, 6}; // Second array
    int size_p = sizeof(p) / sizeof(p[0]);
    int size_q = sizeof(q) / sizeof(q[0]);

    int result[size_p]; // Result array to store the difference
    int result_size = 0;

    // Find the difference
    difference(p, size_p, q, size_q, result, &result_size);

    // Print the result
    printf("Difference (p - q): ");
    for (int i = 0; i < result_size; i++) {
        printf("%d ", result[i]);
    }

    return 0;
}

// Function to calculate the difference between two arrays
void difference(int p[], int size_p, int q[], int size_q, int result[], int *result_size) {
    *result_size = 0; // Initialize the size of the result array

    for (int i = 0; i < size_p; i++) {
        // Check if p[i] is not in q
        if (!isElementInArray(q, size_q, p[i])) {
            result[*result_size] = p[i]; // Add the element to the result array
            (*result_size)++;
        }
    }
}

// Function to check if an element exists in an array
bool isElementInArray(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            return true;
        }
    }
    return false;
}

//Output:
//Difference (p - q): 1 3 