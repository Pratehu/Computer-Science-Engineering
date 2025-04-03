#include <stdio.h>
#include <stdlib.h>

void fun() {
    int *q = (int *)malloc(sizeof(int)); // Allocating memory
    *q = 20;  // Assigning value
} // q goes out of scope here

int main() {
    int *p;      // Uninitialized pointer (wild pointer)
    int *r = NULL; // NULL pointer
    fun();       // Calls function but does not free allocated memory
    return 0;
}

/* Correct statements are:
(i), (ii), and (v)
i.e., p is a wild pointer, r is a NULL pointer, and fun() causes a memory leak.
*/

/*void fun() {
    int *q = (int *)malloc(sizeof(int)); 
    *q = 20;  
    free(q);  // Free allocated memory
}*/


