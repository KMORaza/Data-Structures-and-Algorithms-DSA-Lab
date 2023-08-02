/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-8 (12-11-2022)*/
/* Java code to implement binary search */
package CSE2001_Lab8_20BCD7138;
public class Question1_BinarySearch {
int binarySearch(int arr[], int l, int r, int x){
if (r >= l) {
int mid = l + (r - l) / 2;
if (arr[mid] == x) return mid;
if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);
return binarySearch(arr, mid + 1, r, x);
}
return -1;
}
public static void main(String args[]){
Question1_BinarySearch ob = new Question1_BinarySearch();
int arr[] = { 2, 3, 4, 10, 40 };
int n = arr.length;
int x = 10;
int result = ob.binarySearch(arr, 0, n - 1, x);
if (result == -1)
System.out.println("Element is not present");
else
System.out.println("Element found at index " + result);
}}