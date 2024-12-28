#include <stdio.h>

void sum_n_avg(double a, double b, double c, double *sum, double *avg) {
    *sum = a + b + c;        // Compute sum
    *avg = *sum / 3.0;       // Compute average
}

int main() {
    double one, two, three, sum_of_3, avg_of_3;

    printf("Enter three numbers> ");
    scanf("%lf%lf%lf", &one, &two, &three);

    // Function call with input values and addresses of sum_of_3 and avg_of_3
    sum_n_avg(one, two, three, &sum_of_3, &avg_of_3);

    // Output the results
    printf("Sum: %.2f\n", sum_of_3);
    printf("Average: %.2f\n", avg_of_3);

    return 0;
}

//Output:
//Enter three numbers> 70
//45
//60
//Sum: 175.00
//Average: 58.33