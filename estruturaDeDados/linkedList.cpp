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
	if(newNode == null){
		printf("Erro ao alocar mem�ria.\n");
		return newNode;
	}
	newNode->data = data;
	newNode->next = null;
	return newNode;
}

void initializeList(list* list){
	list->head = null;
	list->tail = null;
}







