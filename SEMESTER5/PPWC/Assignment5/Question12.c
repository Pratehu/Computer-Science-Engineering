#include<stdio.h>
int *fun();
int main(void){
int *ptr;
ptr=fun();
printf("%d\n",*ptr);
return 0;
}
int *fun(){
int a=10,b=20;
int sum=0;
sum=sum+a+b;
return &sum;
}

//Output:
//(A) Unexpected behavoir