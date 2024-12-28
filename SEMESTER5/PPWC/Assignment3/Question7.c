#include <stdio.h>
#include <stdbool.h>

// Function prototypes
void copyDistinctElements(int input[], int size, int output[], int *output_size);
bool isElementInArray(int arr[], int size, int element);

int main() {
    int input[] = {4, 7, 7, 3, 2, 5, 5}; // Input array
    int size = sizeof(input) / sizeof(input[0]);

    int output[size]; // Output array to store distinct elements
    int output_size = 0;

    // Copy distinct elements
    copyDistinctElements(input, size, output, &output_size);

    // Print the output array
    printf("Distinct elements: ");
    for (int i = 0; i < output_size; i++) {
        printf("%d ", output[i]);
    }

    return 0;
}

// Function to copy distinct elements from input array to output array
void copyDistinctElements(int input[], int size, int output[], int *output_size) {
    *output_size = 0; // Initialize the size of the output array

    for (int i = 0; i < size; i++) {
        // Check if input[i] is not already in the output array
        if (!isElementInArray(output, *output_size, input[i])) {
            output[*output_size] = input[i]; // Add the element to the output array
            (*output_size)++;
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
//Distinct elements: 4 7 3 2 5 