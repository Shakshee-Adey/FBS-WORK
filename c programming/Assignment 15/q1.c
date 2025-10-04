#include<stdio.h>
struct book
{
  int id;
  char bname[20];
  char author[30];
  float price;	
};
void storevalue(struct book*,int);
void displayvalue(struct book*,int);
void main()
{
	struct book arr[5];
	storevalue(arr,5);
	displayvalue(arr,5);
}
void storevalue(struct book*arr,int size)
{
	int i;
	printf("enter a values :- \n");
	for(i=0; i<size; i++)
	{
	   scanf("%d",&arr[i].id);
	   scanf("%s",arr[i].bname);
	   scanf("%s",&arr[i].author);
	   scanf("%f",&arr[i].price);
	}
}
void  displayvalue(struct book*arr,int size)
{
	int i;
	printf("id,bname,author,price:- \n");
	for(i=0; i<size; i++)
	{
	printf("%d,%s,%s,%f\n", arr[i].id, arr[i].bname, arr[i].author, arr[i].price);
    }
}
