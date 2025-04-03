int fun(int x, int y) {
    int z = x + y + x * y;
    return z;
}

#include <stdio.h>

int main() {
    int (*fun_ptr)(int, int); // Function pointer declaration
    fun_ptr = fun; // Assigning function address to pointer
    int x = fun_ptr(34, 56); // Calling function using pointer
    printf("%d\n", x); // Printing result
    return 0;
}

//Output: 1994
