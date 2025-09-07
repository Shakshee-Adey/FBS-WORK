#include<stdio.h>
void main()
{
	printf("1 to check number is even or odd\n");
	printf("2 to check number is prime or not\n");
	printf("3 to check number is palindrome or not\n");
	printf("4 to check number is positive, negative,or zero\n");
	printf("5 to reverse a number\n");
	printf("6 to find sum of digit\n");
	
	int choice;
	printf("enter a choice  : ");
	scanf("%d",&choice);
	
	if(choice==1)
	{
		int n;
		printf("enter a number n :");
		scanf("%d",&n);
		if(n%2==0)
		{
			printf("number is even");
		}
		else
		{
			printf("number is odd");
		}
		
	}
	else
	{
		if(choice==2)
		{
			int n=13,i=2,flag=0;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
				i++;
			}
				if(flag==0)
				{
					printf("number is prime");
				}
				else
				{
					printf("number is not prime");
				}
			
		}
		else
		{
			if(choice==3)
			{
				int s,lastd,firstd;
				printf("enter a number");
				scanf("%d",&s);
				lastd=s%10;
				while(s>0)
				{
					firstd=s%10;
					s=s/10;
				}
				if(lastd==firstd)
				{
					printf("number is palindrome");
				}
				else
				{
					printf("number is not palindrome");
				}
			}
			else
			{
				if(choice==4)
				{
					int a;
					printf("enter a number a: ");
					scanf("%d",&a);
				    if(a>0)
					{
						printf("number is positive");
					}
					else
					{
						if(a<0)
						{
							printf("number is negative");
						}
						else
						{
							printf("number is zero");
						}
					}	
				}
				else
				{
					if(choice==5)
					{
					  int a=234,rem,rev;
					  while(a>0)
					  {
					  rem=a%10;
				      rev=rev*10+rem;
					  a=a/10;
		            }
					  printf("revers %d",rev);
					}
					else
					{
						if(choice==6)  // b=456 sum=15
						{
							int b=456 , sum=0,rem;
							while(b>0)
							{
							rem=b%10;
							sum=sum+rem;
							b=b/10;
						    }
						    printf("sum of digit %d",sum);
							
						}
						else
						{
							printf("invalid choice");
						}
					}
				}
			}
		}
	}
}
