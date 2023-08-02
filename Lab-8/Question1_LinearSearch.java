/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-8 (12-11-2022)*/
/* Java code to implement linear search */
package CSE2001_Lab8_20BCD7138;
public class Question1_LinearSearch {
static int search(int arr[], int n, int x){
for (int i = 0; i < n; i++) {
if (arr[i] == x) return i;
}
return -1;
}
public static void main(String[] args){
int[] arr = { 3, 4, 1, 7, 5 };
int n = arr.length;	
int x = 4;
int index = search(arr, n, x);
if (index == -1)
System.out.println("Element is not present in the array");
else
System.out.println("Element found at position " + index);
}}