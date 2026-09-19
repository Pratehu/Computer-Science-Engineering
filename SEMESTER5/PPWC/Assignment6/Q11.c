// #include<stdio.h>
int i=5;
int main()
{
extern int j;
printf("\ni=%d \nj=%d",i,j);
int j=10;
return 0;
}
int j =10;


// Output: i=5 j=0
// Explanation: The variable j is declared as an extern variable, which means it is defined elsewhere. However, in this case, j is not defined before it is used in the printf statement. Therefore, the value of j is 0 when it is printed.
// declaration of 'j' with no linkage follows extern declaration