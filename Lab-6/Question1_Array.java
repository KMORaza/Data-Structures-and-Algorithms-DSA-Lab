/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-6 (15-10-2022)*/
/* Java code to get 20 numbers from user and store in array */
package CSE2001_Lab6_20BCD7138;
import java.util.Scanner;   
public class Question1_Array{   
public static void main(String args[]){   
int m, n, i, j;   
Scanner sc=new Scanner(System.in);   
System.out.print("Enter the number of rows: ");   
m = sc.nextInt();   
System.out.print("Enter the number of columns: ");   
n = sc.nextInt();   
int array[][] = new int[m][n];   
System.out.println("Enter the elements of the array: ");   
for (i = 0; i < m; i++)   
for (j = 0; j < n; j++)   
array[i][j] = sc.nextInt();   
System.out.println("Elements of the array are: ");   
for (i = 0; i < m; i++){   
for (j = 0; j < n; j++)   
System.out.print(array[i][j] + " ");   
System.out.println();   
}}}