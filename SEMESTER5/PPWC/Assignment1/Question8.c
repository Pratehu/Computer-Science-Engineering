#include <stdio.h>
#include <math.h>

int main() {
    float takeoff_speed_kmh, takeoff_speed_ms, distance, acceleration, time;

    // Prompt the user for inputs
    printf("Enter the jet's takeoff speed (km/hr): ");
    scanf("%f", &takeoff_speed_kmh);

    printf("Enter the distance over which the catapult accelerates the jet (meters): ");
    scanf("%f", &distance);

    // Convert takeoff speed from km/hr to m/s
    takeoff_speed_ms = takeoff_speed_kmh * 1000 / 3600;

    // Calculate acceleration using the formula v^2 = 2as
    acceleration = (takeoff_speed_ms * takeoff_speed_ms) / (2 * distance);

    // Calculate time using the formula v = at
    time = takeoff_speed_ms / acceleration;

    // Display the results
    printf("The acceleration of the jet is %.2f m/s^2.\n", acceleration);
    printf("The time to reach takeoff speed is %.2f seconds.\n", time);

    return 0;
}

//Output:
// Enter the jet's takeoff speed (km/hr): 789
// Enter the distance over which the catapult accelerates the jet (meters): 4500
// The acceleration of the jet is 5.34 m/s^2.
// The time to reach takeoff speed is 41.06 seconds.