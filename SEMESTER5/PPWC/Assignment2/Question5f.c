#include<stdio.h>
int main() {
int count = 11;
while (--count+1);
printf("count down is %d \n",count);
return 0;
}

//Output:
// if-- while(--count+1)-->not (--count+l)
// count down is -1 