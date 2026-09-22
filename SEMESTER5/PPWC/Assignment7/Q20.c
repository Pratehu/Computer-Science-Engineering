/*#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

struct node* createNode(int value)
{
    struct node *newNode;

    newNode = (struct node*)malloc(sizeof(struct node));

    newNode->data = value;
    newNode->next = NULL;

    return newNode;
}

struct node* insertEnd(struct node *head, int value)
{
    struct node *newNode = createNode(value);
    struct node *temp;

    if (head == NULL)
        return newNode;

    temp = head;

    while (temp->next != NULL)
        temp = temp->next;

    temp->next = newNode;

    return head;
}

void sortList(struct node *head)
{
    struct node *i, *j;
    int temp;

    for (i = head; i != NULL; i = i->next) {
        for (j = i->next; j != NULL; j = j->next) {

            if (i->data > j->data) {
                temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }
}

void display(struct node *head)
{
    struct node *temp = head;

    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }

    printf("\n");
}

int main()
{
    struct node *head = NULL;
    int n, i, value;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    printf("Enter elements:\n");

    for (i = 0; i < n; i++) {
        scanf("%d", &value);
        head = insertEnd(head, value);
    }

    printf("Original linked list:\n");
    display(head);

    sortList(head);

    printf("Sorted linked list:\n");
    display(head);

    return 0;
}
Example Input:
Enter number of nodes: 5
Enter elements:
40 10 50 20 30
Output:
Original linked list:
40 10 50 20 30

Sorted linked list:
10 20 30 40 50
Node representation:
+------+-------+     +------+-------+     +------+-------+
| data | next  | --> | data | next  | --> | data | next  | --> NULL
+------+-------+     +------+-------+     +------+-------+

The linked-list question specifically requires a node containing an integer and a self-referential structure pointer, followed by sorting the list in ascending order.*/