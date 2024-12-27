#include <stdio.h>
#include <math.h>

int main() {
    double x, term, sum = 0.0;
    int n;

    // Input x from the user
    printf("Enter the value of x (x > 0): ");
    scanf("%lf", &x);

    // Validate the input
    if (x <= 0) {
        printf("Invalid input! x must be greater than 0.\n");
        return 1;
    }

    // Calculate the sum of the first nine terms
    double ratio = (x - 1) / x; // Common term in the series
    for (n = 1; n <= 9; n++) {
        term = pow(ratio, n) / n; // nth term of the series
        sum += term; // Add the term to the sum
    }

    // Display the result
    printf("The sum of the first nine terms of the series is: %.6f\n", sum);

    return 0;
}

//Output:
//Enter the value of x (x > 0): 7
//The sum of the first nine terms of the series is: 1.840701