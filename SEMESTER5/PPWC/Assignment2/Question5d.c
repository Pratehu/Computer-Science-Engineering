#include<stdio.h>
int main(){
int i=1;
while ( ){
printf ( "%d ", i++ ) ;
if(i>10)
break ;
}
return 0;
}

//Output:
//int i = 1;:
//Initialize i to 1 instead of using an undefined l.

//while (1):
//Use an infinite loop (while(1)) since the break statement is used to exit the loop when i > 10.

//if (i > 10):
//The loop will stop printing numbers once i exceeds 10.

//after correction the output will be :
// 1 2 3 4 5 6 7 8 9 10

