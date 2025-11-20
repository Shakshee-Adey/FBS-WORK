#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Book {
	int id;
	char name[100];
	char author[100];
	char category[50];
	int price;
	int rating;
} Book;

Book* addBook(Book *, int *, int *);  //function declaration
void removeBook(Book *, int *);
void searchBook(Book *, int );
void updateBook(Book *, int );
void sortBook(Book *, int );
void display(Book *, int );

int main() {
	int incapacity = 10;
	int n = 10;

Book* Books= (Book*)malloc(incapacity*sizeof(Book));

	Books[0].id = 101;
	strcpy(Books[0].name, "The Alchemist");
	strcpy(Books[0].author, "Paulo Coelho");
	strcpy(Books[0].category, "Fiction");
	Books[0].price = 450;
	Books[0].rating = 5;
	Books[1].id = 102;
	strcpy(Books[1].name, "Atomic Habits");
	strcpy(Books[1].author, "James Clear");
	strcpy(Books[1].category, "Self-Help");
	Books[1].price = 400;
	Books[1].rating = 5;
	Books[2].id = 103;
	strcpy(Books[2].name, "The White Tiger");
	strcpy(Books[2].author, "Aravind Adiga");
	strcpy(Books[2].category, "Fiction");
	Books[2].price = 400;
	Books[2].rating = 5;
	Books[3].id = 104;
	strcpy(Books[3].name, "Wings of Fire");
	strcpy(Books[3].author, "A.P.J. Abdul Kalam");
	strcpy(Books[3].category, "Biography");
	Books[3].price = 450;
	Books[3].rating = 5;
	Books[4].id = 105;
	strcpy(Books[4].name, "Think Like a Monk");
	strcpy(Books[4].author, "Jay Shetty");
	strcpy(Books[4].category, "Self-Help");
	Books[4].price = 290;
	Books[4].rating = 4;
	Books[5].id = 106;
	strcpy(Books[5].name, "The Power of Now");
	strcpy(Books[5].author, "Eckhart Tolle");
	strcpy(Books[5].category, "Spiritual");
	Books[5].price = 580;
	Books[5].rating = 5;
	Books[6].id = 107;
	strcpy(Books[6].name, "The Psychology of Money");
	strcpy(Books[6].author, "Morgan Housel");
	strcpy(Books[6].category, "Finance");
	Books[6].price = 300;
	Books[6].rating = 4;
	Books[7].id = 108;
	strcpy(Books[7].name, "One Indian Girl");
	strcpy(Books[7].author, "Chetan Bhagat");
	strcpy(Books[7].category, "Fiction");
	Books[7].price = 300;
	Books[7].rating = 4;
	Books[8].id = 109;
	strcpy(Books[8].name, "Rich Dad Poor Dad");
	strcpy(Books[8].author, "Robert T. Kiyosaki");
	strcpy(Books[8].category, "Finance");
	Books[8].price = 450;
	Books[8].rating = 4;
	Books[9].id = 110;
	strcpy(Books[9].name, "To Kill a Mockingbird");
	strcpy(Books[9].author, "Harper Lee");
	strcpy(Books[9].category, "Classic Fiction");
	Books[9].price = 500;
	Books[9].rating = 5;

	int choice;

	while (1) {
		printf("\nBook Management Menu:\n");
		printf("1. Add Book\n");
		printf("2. Remove Book\n");
		printf("3. Search Book\n");
		printf("4. Update Book\n");
		printf("5. Sort Books\n");
		printf("6. Display All\n");
		printf("7. Exit\n");

		printf("Enter your choice: ");
		scanf("%d", &choice);

		switch(choice) {
			case 1:
				Books= addBook(Books, &n, &incapacity);
				break;

			case 2:
				removeBook(Books, &n);
				break;

			case 3:
				searchBook(Books, n);
				break;

			case 4:
				updateBook(Books, n);
				break;

			case 5:
				sortBook(Books, n);
				break;

			case 6:
				display(Books, n);
				break;

			case 7:
				free(Books);
				return 0;

			default:
				printf("Invalid choice\n");
		}
	}
}
Book* addBook(Book *Books, int *n, int *capacity) {
	if (*n >= *capacity) {
		*capacity = *capacity * 2;
		Books=realloc(Books, (*capacity) * sizeof(Book));

	}

	printf("Enter book details:\n");

	printf("ID: ");
	scanf("%d", &Books[*n].id);

	printf("Name: ");
	scanf(" %[^\n]", Books[*n].name);

	printf("Author: ");
	scanf(" %[^\n]", Books[*n].author);

	printf("Category: ");
	scanf(" %[^\n]", Books[*n].category);

	printf("Price: ");
	scanf("%d", &Books[*n].price);

	printf("Rating: ");
	scanf("%d", &Books[*n].rating);

	(*n)++;

	printf("Book added successfully\n");

	return Books;
}


// Remove book by ID, Name, or Rating
void removeBook(Book *Books, int *n) {
	int subChoice;
	int i, found = 0;
	int id, rating;
	char name[50];

	printf("Remove by:\n1. ID\n2. Name\n3. Rating\nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter ID: ");
		scanf("%d", &id);
		for (i = 0; i < *n; i++) {
			if (Books[i].id == id) {
				found = 1;
				break;
			}
		}
	} else if (subChoice == 2) {
		printf("Enter Name: ");
		scanf(" %[^\n]", name);
		for (i = 0; i < *n; i++) {
			if (strcmp(Books[i].name, name) == 0) {
				found = 1;
				break;
			}
		}
	} else if (subChoice == 3) {
		printf("Enter Rating: ");
		scanf("%d", &rating);
		for (i = 0; i < *n; i++) {
			if (Books[i].rating == rating) {
				found = 1;
				break;
			}
		}
	} else {
		printf("Invalid choice\n");
		return;
	}

	if (found==1) {
		int j;
		for ( j = i; j < *n - 1; j++) {
			Books[j] = Books[j + 1];
		}
		(*n)--;
		printf("Book removed successfully!\n");
	} else {
		printf("Book not found\n");
	}
}

// Search book by Name, Author, or Category
void searchBook(Book *Books, int n) {
	int subChoice;
	char str[50];
	int found = 0;

	printf("Search by:\n1. Name\n2. Author\n3. Category\nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter Name: ");
		scanf(" %[^\n]", str);
		int i;
		for (i = 0; i < n; i++) {
			if (strcmp(Books[i].name, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n",Books[i].id, Books[i].name, Books[i].author, Books[i].category, Books[i].price, Books[i].rating);
				found = 1;
			}
		}
	} else if (subChoice == 2) {
		printf("Enter Author: ");
		scanf(" %[^\n]", str);
		int i;
		for (i = 0; i < n; i++) {
			if (strcmp(Books[i].author, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n",Books[i].id, Books[i].name, Books[i].author, Books[i].category, Books[i].price, Books[i].rating);
				found = 1;
			}
		}
	} else if (subChoice == 3) {
		printf("Enter Category: ");
		scanf(" %[^\n]", str);
		int i;
		for (i = 0; i < n; i++) {
			if (strcmp(Books[i].category, str) == 0) {
				printf("%d  %s  %s  %s  %d  %d\n", Books[i].id, Books[i].id, Books[i].name, Books[i].author, Books[i].category, Books[i].price, Books[i].rating);
				found = 1;
			}
		}
	} else {
		printf("Invalid choice\n");
		return;
	}
	int choice;
	if (found==0) 
	{
		printf("No books found\n");
		
	printf("do you want search again book \n  enter 1.search again \n enter 2. exit" );
	scanf("%d",&choice)	;
	if(choice==1)
	{
		searchBook(Books,n);
	}
	else
	{
		printf("exit");
	}
	}
}

// Update price or rating
void updateBook(Book *Books, int n) {
	int id, index = -1;
	printf("Enter ID of book to update: ");
	scanf("%d", &id);
    int i;
	for (i = 0; i < n; i++) {
		if (Books[i].id == id) {
			index = i;
			break;
		}
	}

	if (index == -1) {
		printf("Book not found\n");
		return;
	}

	int subChoice;
	printf("Update:\n1. Price\n2. Rating\nEnter choice: ");
	scanf("%d", &subChoice);

	if (subChoice == 1) {
		printf("Enter new price: ");
		scanf("%d", &Books[index].price);
	} else if (subChoice == 2) {
		printf("Enter new rating: ");
		scanf("%d", &Books[index].rating);
	} else {
		printf("Invalid choice\n");
	}
}

// Sort by rating or price
void sortBook(Book *Books, int n) {
	int subChoice;
	printf("Sort by:\n1. Rating\n2. Price\nEnter choice: ");
	scanf("%d", &subChoice);

	Book temp;
	int i;
	for (i = 0; i < n - 1; i++) {
		int j;
		for (j = i + 1; j < n; j++) {
			int swap = 0;

			if (subChoice == 1) {
				if (Books[i].rating > Books[j].rating)  
					swap = 1;
			}

			if (subChoice == 2) {
				if (Books[i].price > Books[j].price)  
					swap = 1;
			}


			if (swap==1) {
				temp = Books[i];
				Books[i] = Books[j];
				Books[j] = temp;
			}
		}
	}
}

// Display all books
void display(Book *Books, int n) {
	printf("\nBook List:\n");
	printf("ID  Name  Author  Category  Price  Rating\n");
	int i;
	for (i = 0; i < n; i++) {
		printf("%d  %s  %s  %s  %d  %d\n",Books[i].id, Books[i].name, Books[i].author, Books[i].category, Books[i].price, Books[i].rating);
	}
}
