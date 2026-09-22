int main(){
struct s1{
char *z;
int i;
struct s1 *p;
};
struct s1 a[]={{"SOA",1,a+1},
{"ITER",2,a+2},
{"CSE",3,a}};
struct s1 *ptr=a;
/*printf("%s\n", ++(ptr→z));
printf("%s\n", a[(++ptr)→i].z);
printf("%s\n",a[--(ptr→p→i)].z);
printf("%d\n",--a[2].i);*/
return 0;
}


/*Connectivity:
a[0] "SOA", i=1  ─────→ a[1]
                          |
                          ↓
a[1] "ITER", i=2 ─────→ a[2]
                          |
                          ↓
a[2] "CSE", i=3  ─────→ a[0]
Statement 1:
printf("%s\n", ++(ptr->z));

Initially:

ptr->z → "SOA"

After incrementing the character pointer:

"SOA" → "OA"

Output:

OA
Statement 2:
printf("%s\n", a[(++ptr)->i].z);

ptr moves from a[0] to a[1].

Therefore:

(++ptr)->i = 2

So:

a[2].z

is printed.

Output:

CSE
Statement 3:
printf("%s\n", a[--(ptr->p->i)].z);

Currently:

ptr → a[1]
ptr->p → a[2]

a[2].i is initially 3.

After decrement:

a[2].i = 2

Therefore:

a[2].z

is printed:

CSE
Statement 4:
printf("%d\n", --a[2].i);

a[2].i is already 2.

After decrement:

1
Final output:
OA
CSE
CSE
1 
*/