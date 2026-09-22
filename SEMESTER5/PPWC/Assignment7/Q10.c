int main(){
struct s1{
char *z;
int i;
struct s1 *p;
};
struct s1 a[]={{"SOA",1,a+1},
{"ITER",4,a+2},
{"CSE",5,a}
};
struct s1 *ptr=a;
printf("%s%s%s\n",a[0].z,a[1].z,a[2].z);
// printf("%s%s%s",(*ptr).z, ptr→z,a[2].p→z);
return 0;
}


/*Node connectivity:
a[0]
+--------+---+------+
| "SOA"  | 1 |  p   |--------+
+--------+---+------+        |
                              ↓
                            a[1]
                       +---------+---+------+
                       | "ITER"  | 4 |  p   |--------+
                       +---------+---+------+        |
                                                     ↓
                                                   a[2]
                                              +---------+---+------+
                                              | "CSE"   | 5 |  p   |
                                              +---------+---+------+
                                                           |
                                                           |
                                                           +----> a[0]
First printf:
printf("%s%s%s\n", a[0].z, a[1].z, a[2].z);

Output:

SOAITERCSE
Second printf:
printf("%s%s%s",
       (*ptr).z,
       ptr->z,
       a[2].p->z);

ptr = a, so:

(*ptr).z       → SOA
ptr->z         → SOA
a[2].p->z      → SOA

Output:

SOASOASOA
Final output:
SOAITERCSE
SOASOASOA. */