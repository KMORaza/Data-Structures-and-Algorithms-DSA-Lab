/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-8 (12-11-2022)*/
/* C code to search specific person using linear search */
#include<stdio.h>
int main(){
int ID;
printf("Enter ID to search: ");
scanf("%d",&ID);
switch(ID) {
case 1:
printf("NAME: Cristiano Ronaldo \nAGE: 37 \nCITY: Funchal, Portugal");
break;
case 2:
printf("NAME: Lionel Messi \nAGE: 35 \nCITY: Rosario, Argentina");
break;
case 3:
printf("NAME: Zinedine Zidane \nAGE: 50 \nCITY: Marseille, France");
break;
case 4:
printf("NAME: Neymar da Silva \nAGE: 30 \nCITY: São Paulo, Brazil");
break;
case 5:
printf("NAME: Rocky Balboa \nAGE: 30 \nCITY: Philadelphia, United States");
break;
default:
printf("Please provide valid ID!");   
}
return 0;
}

