#include <stdio.h>
int main() {
int i = 0 ;
while(i++) {
printf( "%d ",i);
if (i > 2 )
break ;
}
return ( 0);
}

//Output:
//The program does not produce any output. The value of i is incremented to 1 after the condition evaluation, but the loop is already skipped.

//If you want the loop to execute, you might initialize i to a non-zero value, such as 1.






