#include <stdio.h>

void sum_n_avg(double a, double b, double c, double *sum, double *avg) {
    *sum = a + b + c;        // Compute sum
    *avg = *sum / 3.0;       // Compute average
}

int main() {
    double a = 10.0, b = 20.0, c = 30.0;
    double sum, avg;

    sum_n_avg(a, b, c, &sum, &avg);  // Call function with pointers to store results

    printf("Sum: %.2f\n", sum);
    printf("Average: %.2f\n", avg);

    return 0;
}

//Output:
//Sum: 60.00
//Average: 20.00