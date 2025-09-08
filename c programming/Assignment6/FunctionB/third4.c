#include<stdio.h>
int prime();
void main()
{
  int res = prime();
  if (res==1)
   {
   	printf("number is prime");
   }
   else
   {
   	printf("not prime");
   }
}
int prime()
{
	int n,i=2, flag=0;
   printf("enter anumber n: \n ");
   scanf("%d",&n);
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
     return 1;
   else
     return 0;
}
