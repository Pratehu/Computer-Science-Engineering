//  Write a program to find the sum of an array elements using recursion.
int printf(const char *format, ...);

int sumArray(int arr[], int n) {
    if (n == 0) {
        return 0;
    }
    return arr[n - 1] + sumArray(arr, n - 1);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = sumArray(arr, n);
    printf("Sum of array elements: %d\n", result);
    return 0;
}

// Output: Sum of array elements: 15