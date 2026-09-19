/* Declarations used here avoid requiring IntelliSense to locate stdio.h. */
int printf(const char *, ...);
int scanf(const char *, ...);

int a = 0, b = 1;

void print_fibo(int n)
{
    if (n == 0)
        return;

    printf("%d ", a);

    int c = a + b;
    a = b;
    b = c;

    print_fibo(n - 1);
}

int main()
{
    int n;

    printf("Enter the number of Fibonacci numbers: ");
    scanf("%d", &n);

    print_fibo(n);

    return 0;
}

// Output: Enter the number of Fibonacci numbers: 10
// 0 1 1 2 3 5 8 13 21 34 