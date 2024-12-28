#include <stdio.h>

// Function prototype for binary search
int binarySearch(int arr[], int size, int target);

int main() {
    int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; // Sorted array
    int size = sizeof(arr) / sizeof(arr[0]);
    int target = 23; // Element to search for

    // Perform binary search
    int result = binarySearch(arr, size, target);

    if (result != -1) {
        printf("Element %d found at index %d.\n", target, result);
    } else {
        printf("Element %d not found in the array.\n", target);
    }

    return 0;
}

// Function to perform binary search
int binarySearch(int arr[], int size, int target) {
    int bottom = 0;
    int top = size - 1;
    int middle;

    while (bottom <= top) {
        middle = bottom + (top - bottom) / 2; // Avoid overflow

        if (arr[middle] == target) {
            return middle; // Target found
        } else if (arr[middle] > target) {
            top = middle - 1; // Search in the left half
        } else {
            bottom = middle + 1; // Search in the right half
        }
    }

    return -1; // Target not found
}

//Output:
//Element 23 found at index 5.