int main(){
struct out{
char ch[10];
char *str;
};
struct b{
char *c;
struct out o;
};
struct b s2={"ODISHA", "KHURDA","JOYDEV"};
printf("%s %s %s\n",s2.c,s2.o.str,s2.o.ch);
printf("%s %s\n",++s2.c,++s2.o.str);
return 0;
}

/*struct b s2 = {"ODISHA", "KHURDA", "JOYDEV"};

The initialization corresponds to:

s2.c       → "ODISHA"
s2.o.ch    → "KHURDA"
s2.o.str   → "JOYDEV"

Therefore:

printf("%s %s %s\n", s2.c, s2.o.str, s2.o.ch);

Output:

ODISHA JOYDEV KHURDA

Next:

printf("%s %s\n", ++s2.c, ++s2.o.str);

Both character pointers are moved by one position.

ODISHA  → DISHA
JOYDEV  → OYDEV

Output:

DISHA OYDEV
Final output:
ODISHA JOYDEV KHURDA
DISHA OYDEV
*/