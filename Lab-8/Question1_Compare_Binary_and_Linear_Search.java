/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-8 (12-11-2022)*/
/* Java code to compare binary search and linear search */
package CSE2001_Lab8_20BCD7138;
import java.util.Random;
import java.util.Scanner;
public class Question1_Compare_Binary_and_Linear_Search {
public static int N = 1000;
public static int[] sequence = new int[N];
public static boolean sequentialSearch(int[] sequence, int key) {
for (int i = 0; i < sequence.length; i++)
if (sequence[i] == key)
return true;
return false;
}
public static boolean binarySearch(int[] sequence, int key) {
int low = 0, high = sequence.length - 1;
while (low <= high){
int mid = (low + high) / 2;
if (key < sequence[mid]) high = mid - 1;
else if (key > sequence[mid]) low = mid + 1;
else return true;
}
return false;
}
public static void QUICK_SORT_ALGORITHM(int left, int right){
if (right - left <= 0)
return;
else {
int pivot = sequence[right];
int partition = partitionIt(left, right, pivot);
QUICK_SORT_ALGORITHM(left, partition - 1);
QUICK_SORT_ALGORITHM(partition + 1, right);
}}
public static int partitionIt(int left, int right, long pivot){
int leftPtr = left - 1;
int rightPtr = right;
while (true){
while (sequence[++leftPtr] < pivot)               
while (rightPtr > 0 && sequence[--rightPtr] > pivot)
; 
if (leftPtr >= rightPtr)
break;
else
swap(leftPtr, rightPtr);
}
swap(leftPtr, right);
return leftPtr;
}
public static void swap(int dex1, int dex2) {
int temp = sequence[dex1];
sequence[dex1] = sequence[dex2];
sequence[dex2] = temp;
}
public static void main(String args[]) {
System.out.println("Java code for comparing binary search and linear search");
System.out.println("-------------------------------------------------------");
Random random = new Random(); 
for (int i = 0; i < N; i++)
sequence[i] = Math.abs(random.nextInt(100)); 
Scanner sc = new Scanner(System.in);
System.out.println("\nEnter the key to be searched: ");
int k = sc.nextInt();
System.out.println("Time taken to search key using linear search: ");
long startTime = System.nanoTime();
boolean result = sequentialSearch(sequence, k);
long endTime = System.nanoTime(); 
if (result == true)
System.out.println("Key found in " + (endTime - startTime)
+ " nanoseconds");
else
System.out.println("Key doesn't exist, execution time "
+ (endTime - startTime) + " nanoseconds"); 
System.out.println("Time taken to search key using binary search: ");
QUICK_SORT_ALGORITHM(0, N - 1);
startTime = System.nanoTime();
result = sequentialSearch(sequence, k);
endTime = System.nanoTime();
if (result == true)
System.out.println("Key found in " + (endTime - startTime)
+ " nanoseconds");
else
System.out.println("Key doesn't exist, execution time "
+ (endTime - startTime) + " nanoseconds");
sc.close();
}}