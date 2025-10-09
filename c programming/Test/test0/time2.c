#include <stdio.h>

int main() {
    int hours, minutes, seconds;
    int totalSeconds;

    // Input time
    printf("Enter hours: ");
    scanf("%d", &hours);

    printf("Enter minutes: ");
    scanf("%d", &minutes);

    printf("Enter seconds: ");
    scanf("%d", &seconds);

    // Convert to total seconds
    totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

    // Output result
    printf("Total time in seconds = %d seconds\n", totalSeconds);

    return 0;
}

