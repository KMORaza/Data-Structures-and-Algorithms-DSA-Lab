/**
Name: KHAN MOHD OWAIS RAZA
ID : 20BCD7138
Course: Data Structures & Algorithm
Code: CSE2001
Slot: L19+L20
**/
/* Lab-6 (15-10-2022)*/
/* java code for AVL tree*/
package CSE2001_Lab6_20BCD7138;
import java.util.*;
public class Question2{
static class TNode {
int data;
TNode left;
TNode right;
}
static TNode sortedArrayToBST(int arr[], int start, int end){
if (start > end) return null;
int mid = (start + end) / 2;
TNode root = newNode(arr[mid]);
root.left = sortedArrayToBST(arr, start, mid - 1);
root.right = sortedArrayToBST(arr, mid + 1, end);
return root;
}
static TNode newNode(int data){
TNode node = new TNode();
node.data = data;
node.left = null;
node.right = null;
return node;
}
static void printLevelOrder(TNode root){
if (root == null) return;
Queue<TNode > q= new LinkedList<TNode>();
q.add(root);
while (q.size()>0){
TNode node = q.element();
System.out.print( node.data + " ");
q.remove();
if (node.left != null) q.add(node.left);
if (node.right != null) q.add(node.right);
}}
public static void main(String args[]){
int arr[] = {3,2,1,4,5,6,7,8,9};
int n = arr.length;
TNode root = sortedArrayToBST(arr, 0, n - 1);
printLevelOrder(root);
}}