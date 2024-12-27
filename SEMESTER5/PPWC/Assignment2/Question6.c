#include <stdio.h>

// Function to determine if a year is a leap year
int leap(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return 1; // Leap year
    }
    return 0; // Not a leap year
}

// Function to calculate the day number
int day_number(int day, int month, int year) {
    // Days in each month for a common year
    int days_in_month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Adjust for leap year
    if (leap(year)) {
        days_in_month[1] = 29; // February has 29 days in a leap year
    }

    int day_num = 0;

    // Add the days in the months before the given month
    for (int i = 0; i < month - 1; i++) {
        day_num += days_in_month[i];
    }

    // Add the days in the current month
    day_num += day;

    return day_num;
}

int main() {
    int day, month, year;

    // Input the date
    printf("Enter day (1-31): ");
    scanf("%d", &day);
    printf("Enter month (1-12): ");
    scanf("%d", &month);
    printf("Enter year: ");
    scanf("%d", &year);

    // Validate input
    if (month < 1 || month > 12 || day < 1 || day > 31) {
        printf("Invalid date\n");
        return 1;
    }

    // Calculate and print the day number
    int day_num = day_number(day, month, year);
    printf("The day number for %02d/%02d/%d is: %d\n", day, month, year, day_num);

    return 0;
}


//Output:
//Enter day (1-31): 07
//Enter month (1-12): 06
//Enter year: 2004
//The day number for 07/06/2004 is: 159