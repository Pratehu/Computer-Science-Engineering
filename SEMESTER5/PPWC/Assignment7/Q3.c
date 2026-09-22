struct person{
int a;
struct health{
int a;
}h;
};

/*Valid.

Explanation:

A structure type can be declared inside another structure declaration. Here, health is a structure type and h is its member variable.

Therefore, the declaration is valid.

Example:

struct person p;

p.a = 10;
p.h.a = 20;*/