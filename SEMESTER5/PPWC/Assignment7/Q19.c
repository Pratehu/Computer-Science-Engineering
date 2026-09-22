// #include <stdio.h>
//#include <stdlib.h>

#define MAX 100

typedef struct {
    int xx;
    int yy;
    int zz;
    int mm;
    char nickname[11];
} address_t;

void scan_address(address_t *a);
void print_address(address_t a);
int local_address(address_t a1, address_t a2);

int is_none(const char *nickname)
{
    return nickname[0] == 'n' &&
           nickname[1] == 'o' &&
           nickname[2] == 'n' &&
           nickname[3] == 'e' &&
           nickname[4] == '\0';
}

void scan_address(address_t *a)
{
    scanf("%d.%d.%d.%d %10s",
          &a->xx,
          &a->yy,
          &a->zz,
          &a->mm,
          a->nickname);
}

void print_address(address_t a)
{
    printf("%d.%d.%d.%d %s\n",
           a.xx,
           a.yy,
           a.zz,
           a.mm,
           a.nickname);
}

int local_address(address_t a1, address_t a2)
{
    if (a1.xx == a2.xx && a1.yy == a2.yy)
        return 1;
    else
        return 0;
}

int main()
{
    address_t a[MAX];
    int n = 0;
    int i, j;

    while (n < MAX) {
        scan_address(&a[n]);

        if (a[n].xx == 0 &&
            a[n].yy == 0 &&
            a[n].zz == 0 &&
            a[n].mm == 0 &&
            is_none(a[n].nickname))
        {
            break;
        }

        n++;
    }

    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (local_address(a[i], a[j])) {
                printf("Machines %s and %s are on the same local network.\n",
                       a[i].nickname,
                       a[j].nickname);
            }
        }
    }

    printf("\nFull list of addresses:\n");

    for (i = 0; i < n; i++) {
        print_address(a[i]);
    }

    return 0;
}
/*
Sample Input:
111.22.3.44 platte
555.66.7.88 wabash
111.22.5.66 green
0.0.0.0 none
Sample Output:
Machines platte and green are on the same local network.

Full list of addresses:
111.22.3.44 platte
555.66.7.88 wabash
111.22.5.66 green

The program follows the assignment requirement that two computers are considered to be on the same local network when their first two address components match.
*/