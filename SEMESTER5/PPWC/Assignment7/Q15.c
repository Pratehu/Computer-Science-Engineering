int main(){
union unit{
int marks;
int roll;
}s1,s2;
s2.roll=23;
s2.marks=60;
printf("Check memory alloc for union\n");
printf("%d..%d\n",s2.marks,s2.roll);
return 0;
}

/*Output:
Check memory alloc for union
60..60
Reason:

In a union, all members share the same memory location.

Initially:

s2.roll = 23;

Then:

s2.marks = 60;

overwrites the same memory location.

Therefore, reading either member gives the currently stored value:

s2.marks = 60
s2.roll  = 60
*/