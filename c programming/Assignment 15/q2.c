#include <stdio.h>

// Structure definition
struct Time {
    int hrs;
    int min;
    int sec;
};
void inputTime(struct Time *t);
void displayTime(struct Time t);
struct Time addTime(struct Time t1, struct Time t2);
int convertToSeconds(struct Time t);
// Main function

int main() {
    struct Time t1, t2, sum;

    printf("Enter first time:\n");
    inputTime(&t1);

    printf("\nEnter second time:\n");
    inputTime(&t2);

    printf("\nFirst Time: ");
    displayTime(t1);

    printf("Second Time: ");
    displayTime(t2);

    // Add the times
     sum = addTime(t1, t2);

    printf("\nSum of Times: ");
    displayTime(sum);

    // Convert to seconds
    int totalSec = convertToSeconds(sum);
    printf("Total seconds of sum time: %d seconds\n", totalSec);

    return 0;
}

// Function to input time
void inputTime(struct Time *t) {
    printf("Enter hours: ");
    scanf("%d", &t->hrs);
    printf("Enter minutes: ");
    scanf("%d", &t->min);
    printf("Enter seconds: ");
    scanf("%d", &t->sec);
}

// Function to display time
void displayTime(struct Time t) {
    printf("%02d:%02d:%02d\n", t.hrs, t.min, t.sec);
}

// Function to add two time values
struct Time addTime(struct Time t1, struct Time t2) {
    struct Time result;

    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min;
    result.hrs = t1.hrs + t2.hrs;

    // Carry seconds to minutes
    if (result.sec >= 60) {
        result.min += result.sec / 60;
        result.sec = result.sec % 60;
    }

    // Carry minutes to hours
    if (result.min >= 60) {
        result.hrs += result.min / 60;
        result.min = result.min % 60;
    }

    return result;
}

// Function to convert time into total seconds
int convertToSeconds(struct Time t) {
    return (t.hrs * 3600) + (t.min * 60) + t.sec;
}



