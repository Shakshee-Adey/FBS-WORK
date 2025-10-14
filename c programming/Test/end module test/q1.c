#include <stdio.h>
int factorial(int n);
int sumOfSeries(int n);
void main()
{
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    int facts = factorial(n);
    printf("%d\n",facts);
    int result = sumOfSeries(n);
    printf("Sum of series 1! + 2! + ... + %d! = %d\n", n, result);
    return 0;
}
int factorial(int n)
{
    int fact = 1;
    int i;
    for(i = 1; i <= n; i++)
        fact = fact * i;
    return fact;
}
int sumOfSeries(int n)
{
    int sum = 0;
    int i;
    for(i = 1; i <= n; i++)
        sum += factorial(i);
    return sum;
}

