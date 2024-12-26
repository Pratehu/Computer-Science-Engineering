#include <stdio.h>

int main() {
    char desired_grade;
    float min_average, current_average, final_weight, final_score;

    // Prompt the user for input
    printf("Enter desired grade> ");
    scanf(" %c", &desired_grade);

    printf("Enter minimum average required> ");
    scanf("%f", &min_average);

    printf("Enter current average in course> ");
    scanf("%f", &current_average);

    printf("Enter how much the final counts as a percentage of the course grade> ");
    scanf("%f", &final_weight);

    // Calculate the score needed on the final exam
    final_weight /= 100; // Convert percentage to decimal
    final_score = (min_average - (current_average * (1 - final_weight))) / final_weight;

    // Display the result
    printf("You need a score of %.2f on the final to get a %c.\n", final_score, desired_grade);

    return 0;
}

//Output:
// Enter desired grade> B
// Enter minimum average required> 79.5
// Enter current average in course> 78
// Enter how much the final counts as a percentage of the course grade> 20
// You need a score of 85.50 on the final to get a B.