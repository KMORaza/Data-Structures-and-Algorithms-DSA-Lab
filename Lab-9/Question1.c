// KHAN MOHD OWAIS RAZA
// 20BCD7138
// CSE2001 Lab-9
// Question-1
#include <stdio.h>
#include <stdlib.h>
/*
According to question, the graph is
in the form of alphabets.
A     F     C
 \     \   /
  \     \ /
   B     D
  /     /\
H      /  \
 \    /    \
  \  /      \
   G ------- E
   
Let it be:
A = 0, B = 1, C = 2
D = 3, E = 4, F = 5
G = 6, H = 7
As per the graph, 
number of edges = 9,
number of vertices = 8;
Edges are:
0 -> 1 (A -> B)
1 -> 1 (H -> B)
6 -> 7 (G -> H)
4 -> 3 (E -> G)
3 -> 4 (D -> E)
6 -> 3 (G -> D)
3 -> 2 (D -> C)
3 -> 5 (D -> F)
5 -> 2 (F -> C)
*/
int source,V,E,time,visited[20],G[20][20];
void DFS(int i){
int j;
visited[i]=1;
printf(" %d ",i+1);
for(j=0;j<V;j++){
if(G[i][j]==1&&visited[j]==0)
DFS(j);
}}
int main(){
int i,j,v1,v2;
printf("Enter the no of edges:");
scanf("%d",&E);
printf("Enter the no of vertices:");
scanf("%d",&V);
for(i=0;i<V;i++){
for(j=0;j<V;j++)
G[i][j]=0;
}
for(i=0;i<E;i++){
printf("Enter the edges: ");
scanf("%d%d",&v1,&v2);
G[v1-1][v2-1]=1;
}
for(i=0;i<V;i++){
for(j=0;j<V;j++)
printf(" %d ",G[i][j]);
printf("\n");
}
printf("Enter the source: ");
scanf("%d",&source);
DFS(source-1);
return 0;
}

