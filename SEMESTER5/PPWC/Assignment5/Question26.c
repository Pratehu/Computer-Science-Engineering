#include <stdio.h>

// Function prototypes
int fun1(int, int);
int fun2(int, int);

int main() {
    int x, y;
    int (*fun_ptr[2])(int, int); // Array of function pointers

    fun_ptr[0] = fun1;  // Assigning function fun1 to index 0
    x = fun_ptr[0](4, 5); // Calling fun1(4,5)

    fun_ptr[1] = fun2;  // Assigning function fun2 to index 1
    y = (*fun_ptr[1])(4, 5); // Calling fun2(4,5)

    printf("%d...%d\n", x, y); // Printing results
    return 0;
}

// Function definitions
int fun1(int x, int y) {
    return x + y; // Returns sum
}

int fun2(int x, int y) {
    return x * y; // Returns product
}

//Output: 9...20
