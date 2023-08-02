/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-7 (22-10-2022)*/
/*Write a program that takes the details of Students 
(name, roll number, address, CGPA) and sort it in a 
non-decreasing order using Selection sort based on CGPA.*/
#include<stdio.h>
struct student{ 
char name[30];
int rollNumber;
float cgpa;
};
int main(){
struct student s[20], temp;
int i,j,n; 
printf("Enter number of students:\n");
scanf("%d",&n);
for(i=0;i< n;i++){
printf("Enter name, roll number and CGPA of student:\n");
scanf("%s%d%f",s[i].name, &s[i].rollNumber, &s[i].cgpa);
}
for(i=0;i< n-1;i++){
for(j=i+1;j< n;j++){
if(s[i].cgpa>s[j].cgpa){
temp = s[i];
s[i] = s[j];
s[j] = temp;
}}}
printf(" \n");
printf("----------------\n");
printf("Student details:\n");
printf(" \n");
for(i=0;i< n;i++){
printf("Name: %s\n", s[i].name);
printf("Roll: %d\n", s[i].rollNumber);
printf("CGPA: %0.2f\n\n", s[i].cgpa);
}
return 0;
}    
