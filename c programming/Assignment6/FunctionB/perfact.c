#include<stdio.h>
int isperfact();
void main()
{
	int res = isperfact();  //function call
	if(res==1)
	 printf("perfact number");
	else
	 printf("not perfact");
}   // main ends here

 int isperfact()    //function defination
  {
  	int n;
	printf("enter a number : \n");
	scanf("%d",&n);
  	int i=1;
	int sum=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	i++;
	}
	return (n==sum);
  }
