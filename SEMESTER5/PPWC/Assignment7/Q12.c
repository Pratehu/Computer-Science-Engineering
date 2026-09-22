int main(){
struct test{
int i;
char *c;
};
struct test st[]={5, "Cse-Engg",
4, "computer",
6, "Electrical",
8, "Mechnical",
7, "All-Engg"
};
struct test *p=st;
/*printf("%s\n", ++(p++ →c));
printf("%c\n",*p++ →c);
printf("%d\n",++p→i);

printf("%s\n",p[0].c);
printf("%s\n",p→c); */
return 0;
}


/*Statement 1:
printf("%s\n", ++(p++->c));

p initially points to st[0].

p++->c accesses "Cse-Engg" and then p moves to st[1].

++ moves the character pointer one position forward:

Cse-Engg
 ↓
se-Engg

Output:

se-Engg
Statement 2:
printf("%c\n", *p++->c);

p now points to st[1].

p++->c gives:

"computer"

The first character is:

c

Output:

c

Then p moves to st[2].

Statement 3:
printf("%d\n", ++p->i);

p points to st[2].

Initially:

st[2].i = 6

After increment:

7

Output:

7
Statement 4:
printf("%s\n", p[0].c);

p points to st[2].

Therefore:

Electrical
Statement 5:
printf("%s\n", p->c);

Again:

Electrical
Final output:
se-Engg
c
7
Electrical
Electrical
*/
