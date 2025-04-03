int main(){
    void *p;
    int *i=20;
    p=&i;
    void *q=p; //line-4
    //line-5
    printf("%d %d %d\n",i,*p,*q);
    }


//Output
//  (iv) Compile error at line-5

    
// fixing the error 
/*
#include <stdio.h>

int main() {
    void *p;
    int x = 20; 
    int *i = &x;
    p = i;
    void *q = p;

    printf("%p %d %d\n", (void *)i, *(int *)p, *(int *)q); // Corrected
    return 0;
}
*/