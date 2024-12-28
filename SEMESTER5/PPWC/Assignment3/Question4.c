#include <stdio.h>

// Function prototype
void mergeSortedArrays(int arr1[], int m, int arr2[], int n, int merged[]);

int main() {
    // Example 1
    int arr1[] = {12, 20, 24, 32}; // First array
    int arr2[] = {7, 8, 65, 105};  // Second array
    int m = sizeof(arr1) / sizeof(arr1[0]);
    int n = sizeof(arr2) / sizeof(arr2[0]);
    int merged[m + n]; // Merged array

    // Merging arrays
    mergeSortedArrays(arr1, m, arr2, n, merged);

    // Printing the merged array
    printf("Merged sorted array: ");
    for (int i = 0; i < m + n; i++) {
        printf("%d ", merged[i]);
    }

    return 0;
}

// Function to merge two sorted arrays
void mergeSortedArrays(int arr1[], int m, int arr2[], int n, int merged[]) {
    int i = 0, j = 0, k = 0;

    // Merge arrays until one of them is exhausted
    while (i < m && j < n) {
        if (arr1[i] <= arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }

    // Copy any remaining elements from arr1
    while (i < m) {
        merged[k++] = arr1[i++];
    }

    // Copy any remaining elements from arr2
    while (j < n) {
        merged[k++] = arr2[j++];
    }
}


//Output:
//Merged sorted array: 7 8 12 20 24 32 65 105