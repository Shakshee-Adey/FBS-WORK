#include<stdio.h>
struct movie
{
	char title[100];
	char director[50];
	int releaseyear ;
	char genre[100];
};
void addmovie(struct movie *allmovie,int *count,int size);
void displaymovies(struct movie *allmovie, int count);
void updatemovie(struct movie *allmovie, int count);
void updatemovie(struct movie *allmovie, int count);
void main()
{
	int size;
	int count=0;
	printf("enter array size :- \n");
	scanf("%d",&size);
	struct movie allmovie[size];
	int choice;
	
	do
	{
	printf("enter a choice :- \n");
	printf("1. for addmovie\n");
	printf("2. for displaymovie\n");
	printf("3. for searchmovie\n");
	printf("4. for updatemovie\n");
	printf("5. for exit\n");
	printf("choice is :- ");
	scanf("%d",&choice);
	
	switch(choice)
	{
		case 1 :
			addmovie(allmovie,&count,size);
		break;
		case 2 :
		    displaymovies(allmovie,count);
		break;
		case 3 :
		    searchmovie(allmovie,count);
		break;
		case 4 :
		    updatemovie(allmovie,count);
		break;
		case 5 :
			printf("exiting the program\n");
		break;
	    default :
		   printf("invalid choice ! try again\n");	
	}
	
    } while(choice !=5);
    
}
void addmovie(struct movie *allmovie,int *count,int size)
{
	if(*count>=size)
	{
		printf("movie list is full!\n");
		return ;
	}
	printf("enter movie title :- ");
	scanf("%s",allmovie[*count].title);
	printf("enter director name :- ");
	scanf("%s",allmovie[*count].director);
	printf("enter release year :- ");
	scanf("%d",&allmovie[*count].releaseyear);
	printf("enter genre :- ");
	scanf("%s",allmovie[*count].genre);
	
	(*count)++;
	printf("movie added successfully!\n");
}
void displaymovies(struct movie *allmovie, int count) 
{
    if (count == 0)
	{
        printf("No movies available in the database.\n");
        return;
    }

    printf("Movie List ---\n");
    int i;
    for (i = 0; i < count; i++) 
	{
        printf("\nmovie %d\n", i + 1);
        printf("title :- %s\n", allmovie[i].title);
        printf("director :- %s\n", allmovie[i].director);
        printf("releaseyear :- %d\n", allmovie[i].releaseyear);
        printf("genre :- %s\n", allmovie[i].genre);
    }
}
void searchmovie(struct movie *allmovie, int count) 
{
    if (count == 0) 
	{
        printf("\nNo movies available to search.\n");
        return;
    }
    char searchTitle[100];
    printf("\nEnter the movie title to search: ");
    scanf(" %[^\n]",searchTitle);

    int found = 0;
    int i;
    for (i = 0; i < count; i++) {
        if (strcmp(allmovie[i].title, searchTitle) == 0)
		 {
            printf("\nMovie Found!\n");
            printf("Title:-%s\n",allmovie[i].title);
            printf("Director:-%s\n",allmovie[i].director);
            printf("Release Year:-%d\n",allmovie[i].releaseyear);
            printf("Genre:-%s\n",allmovie[i].genre);
            found = 1;
            break;
        }
    }

    if (found==0) 
	{
        printf("Movie not found!\n");
    }
}
void updatemovie(struct movie *allmovie, int count) 
{
    if (count == 0)
	 {
        printf("\nNo movies available to update.\n");
        return;
    }

    char updateTitle[100];
    printf("\nEnter the movie title to update: ");
    scanf(" %[^\n]",updateTitle);

    int found = 0;
    int i;
    for (i = 0; i < count; i++) {
        if (strcmp(allmovie[i].title, updateTitle) == 0)
		 {
            printf("\nMovie Found! Enter new details:\n");
            printf("Enter new director name: ");
            scanf(" %[^\n]",allmovie[i].director);
            printf("Enter new release year: ");
            scanf("%d",&allmovie[i].releaseyear);
            printf("Enter new genre: ");
            scanf(" %[^\n]",allmovie[i].genre);

            printf("Movie details updated successfully!\n");
            found = 1;
            break;
        }
    }

    if (found==0) {
        printf("Movie not found!\n");
    }
}

    

