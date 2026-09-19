// file1.c--------------
extern int count;
void write_extern(){
count +=2;
}

// file2.c--------------
//#include<stdio.h>
//#include "file1.c"
int count = 5;
int main(){
write_extern();
write_extern();
printf("%d\n", count);
return(0);
}

// Output: 9
// extern int count; tells file1.c that count is defined elsewhere. The two calls to write_extern() each increase the global count by 2.