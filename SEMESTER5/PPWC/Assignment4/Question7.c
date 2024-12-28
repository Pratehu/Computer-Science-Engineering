#include <stdio.h>

int main() {
    // Declare and initialize variables
    int a = 52;
    int b = 18;

    // Declare pointers and initialize them to point to a and b
    int *ptr1 = &a;
    int *ptr2 = &b;

    // Compare the values pointed to by ptr1 and ptr2 and print the greater one
    if (*ptr1 > *ptr2) {
        printf("The greater value is: %d\n", *ptr1);  // Dereference ptr1 to get the value of a
    } else {
        printf("The greater value is: %d\n", *ptr2);  // Dereference ptr2 to get the value of b
    }

    return 0;
}


//Output:
//The greater value is: 52