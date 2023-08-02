/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-8 (12-11-2022)*/
/* C code to avoid collision in hashing */
#include <stdio.h>
#include <stdlib.h>
#define TABLE_SIZE 10
struct node{
int data;
struct node *next;
};
struct node *head[TABLE_SIZE]={NULL},*c;
void insert(){
int i,key;
printf("\nEnter a value to insert into hash table:\n");
scanf("%d",&key);
i=key%TABLE_SIZE;
struct node * newnode=(struct node *)
malloc(sizeof(struct node));
newnode->data=key;
newnode->next = NULL;
if(head[i] == NULL)
head[i] = newnode;
else{
c=head[i];
while(c->next != NULL){
c=c->next;
}
c->next=newnode;
}}
void search()
{
int key,index;
printf("\nEnter the element to be searched:\n");
scanf("%d",&key);
index=key%TABLE_SIZE;
if(head[index] == NULL)
printf("\nElement is not present\n");
else{
for(c=head[index];c!=NULL;c=c->next){
if(c->data == key){
printf("Element is present\n");
break;
}}
if(c==NULL)
printf("\nElement is not present\n");
}}
void display(){
int i;
for(i=0;i<TABLE_SIZE;i++){
printf("\nEntries at index %d:\n",i);
if(head[i] == NULL){
printf("No Hash Entry \n");
}
else{
for(c=head[i];c!=NULL;c=c->next)
printf("%d  ",c->data);
printf("\n");
}}}
main(){
printf("C code to avoid collision in hashing \n");
printf("------------------------------------ \n");
int opt,key,i;
while(1){
printf("\nSelect an operation:");
printf("\n[1] Insert  [2] Display  [3] Search  [4] Exit \n");
scanf("%d",&opt);
switch(opt){
case 1:insert();
break;
case 2:display();
break;
case 3:search();
break;
case 4:exit(0);
}}}

