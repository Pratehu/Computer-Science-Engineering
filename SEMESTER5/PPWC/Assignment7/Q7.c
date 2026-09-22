/*(1) union{....}u;
(2) union u{......};
(3) struct{.....}s;
(4) struct s{.....};


(1)
union { .... } u;

Valid.

It declares an unnamed union and a variable u.

(2)
union u { ...... };

Valid.

It defines a union type named u, but does not declare a variable.

(3)
struct { ..... } s;

Valid.

It defines an unnamed structure and declares variable s.

(4)
struct s { ..... };

Valid.

It defines a structure type named s, but does not declare an object.

Conclusion:
Declaration	Result
union { ... } u;	Valid
union u { ... };	Valid
struct { ... } s;	Valid
struct s { ... };	Valid */