struct s{int *p;};
int main(){int a=200;struct s s1;
s1.p=&a;
*(s1.p)=*(s1.p)+100;
printf("%d %d\n",a,*(s1.p));
return 0;}

/* 300 300
Reason:

Initially:

a = 200

s1.p stores the address of a.

Therefore:

*(s1.p)

refers to a.

So:

*(s1.p) = *(s1.p) + 100;

becomes:

a = a + 100;

Thus:

a = 300

and *(s1.p) is also 300.*/