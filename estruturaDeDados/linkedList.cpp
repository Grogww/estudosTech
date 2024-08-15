#include <stdio.h>
#include <stdlib.h>


//Defini��o do n� da lista
typedef struct node{
	int data;
	struct node* next;
} node;

//Defini��o da estrutura da lista
typedef struct list{
	node* head;
	node* tail;
} list;


//function p/ criar um novo n�
node* createNode(int data){
	node* newNode = (node*) malloc(sizeof(node));
	if(newNode == NULL){
		printf("Erro ao alocar mem�ria.\n");
		return newNode;
	}
	newNode->data = data;
	newNode->next = NULL;
	return newNode;
}

void initializeList(list* list){
	list->head = NULL;
	list->tail = NULL;
}

void insertNode(list* list, int data){
	node* newNode = createNode(data);
	if(list->head == NULL){
		list->head = newNode;
	}else{
		node* current = list->head;
		while(current->next != NULL){
			current = current->next;
		}
		current->next = newNode;
	}
}

void displayList(list* list){
	node* current = list->head;
	while(current != NULL){
		printf("%i -> ", current->data);
		current = current->next;
	}
	printf("NULL\n");
}

main(){
	list list;
	initializeList(&list);
	
	insertNode(&list, 10);
	insertNode(&list, 20);
	insertNode(&list, 30);
	
	printf("Lista encadeada: ");
	displayList(&list);
}


