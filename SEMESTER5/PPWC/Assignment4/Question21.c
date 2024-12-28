#include <stdio.h>

// Function prototype
void arrange(int *a, int *b);

int main() {
    int n1, n2, n3, n4, n5, n6;
    
    // Prompting user to enter six numbers
    printf("Enter SIX numbers separated by blanks> ");
    scanf("%d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6);
    
    // Sorting using multiple calls to arrange
    arrange(&n1, &n2);
    arrange(&n1, &n3);
    arrange(&n1, &n4);
    arrange(&n1, &n5);
    arrange(&n1, &n6);
    arrange(&n2, &n3);
    arrange(&n2, &n4);
    arrange(&n2, &n5);
    arrange(&n2, &n6);
    arrange(&n3, &n4);
    arrange(&n3, &n5);
    arrange(&n3, &n6);
    arrange(&n4, &n5);
    arrange(&n4, &n6);
    arrange(&n5, &n6);
    
    // Display the sorted numbers
    printf("The numbers in ascending order are: %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6);

    return 0;
}

// Function to arrange the numbers in ascending order
void arrange(int *a, int *b) {
    if (*a > *b) {
        // Swap values
        int temp = *a;
        *a = *b;
        *b = temp;
    }
}

//Output:
//Enter SIX numbers separated by blanks> 9 7 10 6 3 4
//The numbers in ascending order are: 3 4 6 7 9 10