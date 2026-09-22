struct oswcourse{
int secid;
float avgm;
char present;
// int *marks();
// int teacher();
}o1,o2;


/*The invalid members are:

int *marks();
int teacher();
Explanation:

A structure in C cannot contain a function as a member. It can contain a pointer to a function.

The following are function declarations, not function-pointer declarations:

int *marks();
int teacher();

A valid function pointer would be:

int (*marks)();

Therefore, marks() and teacher() are invalid structure members.*/