#include <stdio.h>

// Function prototype
void bubbleSort(int arr[], int size);

// Function to print an array
void printArray(int arr[], int size);

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90}; // Example array
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Original array:\n");
    printArray(arr, size);

    // Sorting the array
    bubbleSort(arr, size);

    printf("\nSorted array:\n");
    printArray(arr, size);

    return 0;
}

// Bubble sort function
void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        // Perform passes over the unsorted portion
        for (int j = 0; j < size - i - 1; j++) {
            // Swap if elements are out of order
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Function to print an array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}


//Output:
//Original array:
//64 34 25 12 22 11 90 

//Sorted array:
//11 12 22 25 34 64 90 