#include<stdio.h>
int main(){
int a[3][3]={4,5,6,7,8,9,1,2,3};
printf("%p %p %p\n",a[1]+2,*(a+1)+2,&a[1][2]);

printf("%d %d %d\n",*(a[1]+2),*(*(a+1)+2), a[1][2]);
return 0;
}

//Output:
//000000000061fe14 000000000061fe14 000000000061fe14
//9 9 9