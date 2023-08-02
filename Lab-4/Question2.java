/**
 Name: KHAN MOHD OWAIS RAZA
 ID : 20BCD7138
 Course: Data Structures & Algorithm
 Code: CSE2001
 Slot: L19+L20
**/
/* Lab-4 (01-10-2022)*/
/* Java code to implement circular linked list and its operations */
package CSE2001_Lab4_20BCD7138;
import java.util.Scanner;
class Node{
protected int data;
protected Node link; 
public Node(){
link = null;
data = 0;
}    
public Node(int d,Node n){
data = d;
link = n;
}    
public void setLink(Node n){
link = n;
}    
public void setData(int d){
data = d;
}    
public Node getLink(){
return link;
}   
public int getData(){
return data;
}}
class CLL{
protected Node start ;
protected Node end ;
public int size ; 
public CLL(){
start = null;
end = null;
size = 0;
}
public boolean isEmpty(){
return start == null;
}
public int getSize(){
return size;
}
public void insertAtStart(int val){
Node nptr = new Node(val,null);    
nptr.setLink(start);
if(start == null){     
start = nptr;
nptr.setLink(start);
end = start;            
}
else{
end.setLink(nptr);
start = nptr;        
}
size++ ;
}
public void insertAtEnd(int val){
Node nptr = new Node(val,null);    
nptr.setLink(start);
if(start == null){           
start = nptr;
nptr.setLink(start);
end = start;            
}
else{
end.setLink(nptr);
end = nptr;            
}
size++ ;
}
public void insertAtPos(int val , int pos) {
Node nptr = new Node(val,null);                
Node ptr = start;
pos = pos - 1 ;
for(int i = 1; i < size - 1; i++){
if (i == pos){
Node tmp = ptr.getLink() ;
ptr.setLink(nptr);
nptr.setLink(tmp);
break;
}
ptr = ptr.getLink();
}
size++ ;
}
public void deleteAtPos(int pos){   
if (size == 1 && pos == 1){
start = null;
end = null;
size = 0;
return ;
}        
if (pos == 1){
start = start.getLink();
end.setLink(start);
size--; 
return ;
}
if (pos == size){
Node s = start;
Node t = start;
while (s != end){
t = s;
s = s.getLink();
}
end = t;
end.setLink(start);
size --;
return;
}
Node ptr = start;
pos = pos - 1 ;
for (int i = 1; i < size - 1; i++){
if (i == pos){
Node tmp = ptr.getLink();
tmp = tmp.getLink();
ptr.setLink(tmp);
break;
}
ptr = ptr.getLink();
}
size-- ;
}
public void display(){
System.out.print("\nCircular linked list: ");
Node ptr = start;
if (size == 0) {
System.out.print("Empty\n");
return;
}
if (start.getLink() == start){
System.out.print(start.getData()+ "->"+ptr.getData()+ "\n");
return;
}
System.out.print(start.getData()+ "->");
ptr = start.getLink();
while (ptr.getLink() != start){
System.out.print(ptr.getData()+ "->");
ptr = ptr.getLink();
}
System.out.print(ptr.getData()+ "->");
ptr = ptr.getLink();
System.out.print(ptr.getData()+ "\n");
}}
public class Question2{   
public static void main(String[] args){           
Scanner scan = new Scanner(System.in);
CLL list = new CLL(); 
System.out.print("\nKHAN MOHD OWAIS RAZA (20BCD7138)");
System.out.print("\nCSE2001 Lab-4");
System.out.print("\n");
System.out.print("\n");
System.out.print("\nJava code to implement circular linked list and its operations");
System.out.print("\n");
char ch;
do{
System.out.println("\nSelect an operation: \n");
System.out.println("[1] Insert element at beginning");
System.out.println("[2] Insert element at ending");
System.out.println("[3] Insert element at a position");
System.out.println("[4] Delete element from a position");
System.out.println("[5] Check if the list is empty");
System.out.println("[6] Display size");           
int choice = scan.nextInt();            
switch (choice){
case 1 : System.out.println("\nEnter the element to be inserted: ");
list.insertAtStart( scan.nextInt() );                     
break;                          
case 2 : 
System.out.println("\nEnter the element to be inserted: ");
list.insertAtEnd( scan.nextInt() );                     
break;                         
case 3 : 
System.out.println("\nEnter the element to be inserted: ");
int num = scan.nextInt() ;
System.out.println("Enter position:");
int pos = scan.nextInt() ;
if (pos <= 1 || pos > list.getSize()) System.out.println("Invalid position\n");
else list.insertAtPos(num, pos);
break;                                          
case 4 : System.out.println("Enter position");
int p = scan.nextInt() ;
if (p < 1 || p > list.getSize()) System.out.println("Invalid position\n");
else list.deleteAtPos(p);
break;
case 5 : System.out.println("Empty status: "+ list.isEmpty());
break;                   
case 6 : 
System.out.println("Size = "+ list.getSize() +" \n");
break;                         
default : System.out.println("Incorrect entry \n ");
break;   
}
list.display();
System.out.println("\nPress 'C' to continue or 'S' to stop\n");
ch = scan.next().charAt(0);            
} while (ch == 'C');                    
}}