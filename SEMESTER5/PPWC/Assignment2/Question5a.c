#include<stdio.h>
int main(){
float x = 25.0, y=10.0;
if(y != (x - 10.0))
x = x - 10.0;
else
x = x / 2.0;
return 0;
}

//Output:
// The value of x at the end of the program is 15.0.
// However, no output is displayed since the program lacks a printf statement.