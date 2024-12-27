#include <stdio.h>

int main() {
    int marks;
    char grade;

    // Input marks from the user
    printf("Enter marks obtained by the student (0-100): ");
    scanf("%d", &marks);

    // Validate the marks input
    if (marks < 0 || marks > 100) {
        printf("Invalid marks. Please enter a value between 0 and 100.\n");
        return 1;
    }

    // Determine grade using switch-case
    switch (marks / 10) {
        case 10: // For marks = 100
        case 9:  // For marks 90-99
            grade = 'O';
            break;
        case 8:  // For marks 81-89
            grade = 'A';
            break;
        case 7:  // For marks 71-80
            grade = 'B';
            break;
        case 6:  // For marks 61-70
            grade = 'C';
            break;
        case 5:  // For marks 51-60
            grade = 'D';
            break;
        case 4:  // For marks 40-50
            grade = 'E';
            break;
        default: // For marks < 40
            grade = 'F';
            break;
    }

    // Display the grade
    printf("The grade for marks %d is: %c\n", marks, grade);

    return 0;
}

//Output:
//Enter marks obtained by the student (0-100): 90
//The grade for marks 90 is: O
