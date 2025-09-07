#include<stdio.h>
void avrage();
void main()
{
  avrage();	
}
void avrage()
{
  int a,b,c,d,e,sum=0,avrage;
  printf("enter a number a :\n");
  scanf("%d",&a);
  printf("enter a number b :\n");
  scanf("%d",&b);
  printf("enter a number c :\n");
  scanf("%d",&c);
  printf("enter a number d :\n");
  scanf("%d",&d);
  printf("enter a number e :\n");
  scanf("%d",&e);
  
  sum=a+b+c+d+e;
  printf("sum = %d\n",sum);
  avrage= sum/5;
  printf("avrage = %d\n",avrage);	
}
