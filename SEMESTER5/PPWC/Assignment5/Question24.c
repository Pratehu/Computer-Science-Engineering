#include <stdio.h>

int main() {
    void demo();
    void (*fun)();
    fun = demo;
    (*)fun();  // Syntax error
    fun();
    return 0;
}

#include <stdio.h>
void demo() {
    printf("SS");
}


/*
#include <stdio.h>

void demo(); // Function prototype

int main() {
    void (*fun)();
    fun = demo;
    (*fun)(); // Corrected syntax
    fun();
    return 0;
}

void demo() {
    printf("SS");
}
*/

//Output: SSSS
