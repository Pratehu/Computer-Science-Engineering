struct person{
int a;
union health{
int w;
}h;
};

/*Correct / Valid.

Explanation:

A union can be declared inside a structure. Here:

union health {
    int w;
} h;

declares a union named health and a union variable h inside struct person.

Therefore, the declaration is valid.*/