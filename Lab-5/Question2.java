/**
 Name: KHAN MOHD OWAIS RAZA
 ID : 20BCD7138
 Course: Data Structures & Algorithm
 Code: CSE2001
 Slot: L19+L20
**/
/* Lab-5 (08-10-2022)*/
/* Java code to implement binary tree traversals using recursion */
package CSE2001_Lab5_20BCD7138;
class Node {
int item;
Node left, right;
public Node(int key) {
item = key;
left = right = null;
}}
public class Question2 {
Node root;
Question2() {
root = null;
}
void postorder(Node node) {
if (node == null) return;
postorder(node.left);
postorder(node.right);
System.out.print(node.item + "  ");
}
void inorder(Node node) {
if (node == null) return;
inorder(node.left);
System.out.print(node.item + "  ");
inorder(node.right);
}
void preorder(Node node) {
if (node == null) return;
System.out.print(node.item + "  ");
preorder(node.left);
preorder(node.right);
}
public static void main(String[] args) {
Question2 tree = new Question2();
tree.root = new Node(1);
tree.root.left = new Node(12);
tree.root.right = new Node(9);
tree.root.left.left = new Node(5);
tree.root.left.right = new Node(6);
System.out.println("KHAN MOHD OWAIS RAZA (20BCD7138)");
System.out.println("CSE2001 (DSA) Lab-5");
System.out.println("");
System.out.println("Java code implement binary tree traversals using recursion"); 
System.out.println("----------------------------------------------------------");
System.out.println("");
System.out.println("Inorder traversal:");
tree.inorder(tree.root);
System.out.println("\n\nPreorder traversal:");
tree.preorder(tree.root);
System.out.println("\n\nPostorder traversal:");
tree.postorder(tree.root);
}}