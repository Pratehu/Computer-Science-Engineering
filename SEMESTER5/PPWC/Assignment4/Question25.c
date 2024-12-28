#include <stdio.h>

int findLargest(int *arr, int size) {
    int *ptr = arr;      // Pointer to the first element of the array
    int largest = *ptr;  // Assume the first element is the largest
    
    // Traverse the array using the pointer
    for (int i = 1; i < size; i++) {
        ptr++;  // Move the pointer to the next element
        if (*ptr > largest) {
            largest = *ptr;  // Update the largest value
        }
    }
    
    return largest;  // Return the largest value found
}

int main() {
    int arr[] = {34, 78, 12, 56, 89, 3, 65};  // Example array
    int size = sizeof(arr) / sizeof(arr[0]);  // Calculate the size of the array
    
    int largest = findLargest(arr, size);  // Call function to find the largest value
    
    // Output the largest value
    printf("The largest value in the array is: %d\n", largest);
    
    return 0;
}

//Output:
//The largest value in the array is: 89