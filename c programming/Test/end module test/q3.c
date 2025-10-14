#include<stdio.h>
#include<string.h>
struct mobile
{
	int mid;
	char mname[100];
	float price;
	char brand[50];
};
void addmobile(struct mobile arr[],int*count);
void dispalymobile(struct mobile arr[],int count);
void main()
{
  struct mobile arr[20];
  int choice;
  int count=0;
  do
  {
  printf("menu is:-\n");
  printf("1 for add\n");
  printf("2 for display\n");
  printf("3 for exit the program\n");
  printf("enter a choice:-");
  scanf("%d",&choice);
  switch(choice)
  {
   case 1:
  	addmobile(arr,&count);
  	break;
   case 2:
  	displaymobile(arr,count);
    break;
   case 3:
   	printf("exit program");
   	break;
   default :
    printf("invalid choice");
}
}while(choice!=3);
}
void addmobile(struct mobile arr[],int*count)
{
    scanf("%d",&arr[*count].mid);
    scanf("%s",arr[*count].mname);
    scanf("%f",&arr[*count].price);
    scanf("%s",arr[*count].brand);
	(*count)++;
}
void displaymobile(struct mobile arr[],int count)
{
	if(count==0)
	{
		printf("mobile is not available\n");
	}
	int i;
	for(i=0; i<count; i++)
	{
	printf("%d\n",arr[i].mid);
	printf("%s\n",arr[i].mname);
	printf("%f\n",arr[i].price);
	printf("%s\n",arr[i].brand);
}
}
