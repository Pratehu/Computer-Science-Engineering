int main(){
struct student{
int h;
int w;
int m;
};
struct student s1={20,40,50};
struct student *ptr=&s1;
printf("%d\n",*((int *)ptr+2));
return 0;
}


/*50
Reason:

The structure contains three integer members:

s1
+-----+-----+-----+
| 20  | 40  | 50  |
+-----+-----+-----+
  h     w     m

ptr points to the beginning of the structure.

After casting:

(int *)ptr

the pointer is treated as an integer pointer.

Therefore:

((int *)ptr + 2)

points to the third integer, whose value is 50.

Hence:

50. */