struct date{
int m,d,y;
};
struct stud{
char name[20];
struct stud *p;
struct date *d;
// int (*)fun(int, int);
};

/*The invalid member is:

int (*)fun(int, int);
Correct form:
int (*fun)(int, int);
Explanation:

fun is intended to be a pointer to a function that takes two integers and returns an integer.

The correct syntax is:

return_type (*function_pointer)(parameters);

Hence:

int (*fun)(int, int);

is valid.*/