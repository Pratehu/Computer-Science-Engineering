struct person{
int ht;
float wt;
char color;
struct person p; /*Line- 5 */
};

/*Invalid.

Explanation:

A structure cannot contain an object of its own type directly because this would require infinite memory.

Conceptually:

person
 └── person
      └── person
           └── person
                ...

Therefore:

struct person p;

cannot be a member of struct person.

However, a pointer to the same structure is allowed:

struct person *p;

This is called a self-referential structure.

Correct version:

struct person {
    int ht;
    float wt;
    char color;
    struct person *p;
};*/