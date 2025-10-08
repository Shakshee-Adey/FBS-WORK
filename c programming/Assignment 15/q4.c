#include <stdio.h>
#include <string.h>

// Structure for product
struct Product {
    char name[50];
    float price;
    int quantity;
};

// Function declaration
void addProduct(struct Product *p, int *count);
void displayCart(struct Product *p, int count);
float calculateTotal(struct Product *p, int count);

int main() {
    struct Product cart[100];  // array to store up to 100 products
    int count = 0;             // how many products are added
    int choice;
    float total;

    do {
        printf("Point of Sale System \n");
        printf("1. Add Product to Cart\n");
        printf("2. Display Cart\n");
        printf("3. Calculate Total\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                addProduct(cart, &count);
                break;
            case 2:
                displayCart(cart, count);
                break;
            case 3:
                total = calculateTotal(cart, count);
                printf("Total Cost: %f\n", total);
                break;
            case 4:
                printf("Exiting program \n");
                break;
            default:
                printf("Invalid choice! Try again.\n");
        }

    } while(choice != 4);

    return 0;
}

// Function to add product
void addProduct(struct Product *p, int *count) {
    printf("\nEnter product name: ");
    scanf(" %s", p[*count].name);

    printf("Enter product price: ");
    scanf("%f", &p[*count].price);

    printf("Enter quantity: ");
    scanf("%d", &p[*count].quantity);

    (*count)++;
    printf("Product added to cart successfully\n");
}

// Function to display cart
void displayCart(struct Product *p, int count) {
    if(count == 0) {
        printf("\nCart is empty\n");
        return;
    }
    printf("Your Cart\n");
    int i;
    for( i = 0; i < count; i++) {
        printf("%d. %s - %f x %d = %f\n", i+1,p[i].name,p[i].price,p[i].quantity,p[i].price * p[i].quantity);
    }
}

// Function to calculate total cost
float calculateTotal(struct Product *p, int count) {
    float total = 0;
    int i;
    for(i = 0; i < count; i++) {
        total += p[i].price * p[i].quantity;
    }
    return total;
}

