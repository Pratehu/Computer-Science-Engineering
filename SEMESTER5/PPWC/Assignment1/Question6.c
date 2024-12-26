#include <stdio.h>

int main() {
    float meters;

    // Prompt the user for distance in meters
    printf("Enter distance in meters: ");
    scanf("%f", &meters);

    // Perform conversions
    float kilometers = meters * 0.001;
    float centimeters = meters * 100;
    float millimeters = meters * 1000;
    float feet = meters * 3.28084;
    float inches = meters * 39.3701;

    // Display the conversion table
    printf("+----------+-------+\n");
    printf("| Unit    | Value  |\n");
    printf("+----------+-------+\n");
    printf("| Meters     |%16.2f|",meters);
    printf("| Kilometers |%16.2f|",kilometers);
    printf("| Centimeters|%16.2f|",centimeters);
    printf("| Millimeters|%16.2f|",millimeters);
    printf("| Feet       |%16.2f|",feet);
    printf("| Inches     |%16.2f|",inches);
    printf("+----------+---------+");

    return 0;
}
