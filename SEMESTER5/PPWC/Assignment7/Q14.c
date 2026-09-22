int main(){
union unit{
int marks;
int roll;
}s1,s2;
s2.roll=23;
s1.marks=60;
printf("%d..%d\n",s1.marks,s2.roll);
return 0;
}

/*Output: 60..23
Reason:

s1 and s2 are two separate union variables.

Therefore, assigning a value to s1.marks does not affect s2.roll.*/