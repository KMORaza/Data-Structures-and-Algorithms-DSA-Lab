// KHAN MOHD OWAIS RAZA
// 20BCD7138
// CSE2001 Lab-9
// Challenging Question-3
#include <stdio.h>
#include <limits.h>
#define V 5
/*
Matrix table for the given graph:-
     A   B   C   D   E   F   G   H
**********************************
A    0   8   0   0   0  10   0   4
B    8   0   4   0  10   7   0   9
C    0   4   0   3   0   3   0   0
D    0   0   3   0  25  18   2   0
E    0  10   0  25   0   2   7   0
F   10   7   3  18   2   0   0   0
G    0   0   0   2   7   0   0   3
H    4   9   0   0   0   0   3   0
*/
int minKey(int key[], int mstSet[]) {
int min = INT_MAX, min_index;
int v;
for (v = 0; v < V; v++)
if (mstSet[v] == 0 && key[v] < min)
min = key[v], min_index = v;
return min_index;
}
int printMST(int parent[], int n, int graph[V][V]) {
int i;
printf("Edge   Weight\n");
for (i = 1; i < V; i++)
printf("%d - %d    %d \n", parent[i], i, graph[i][parent[i]]);
}
void primMST(int graph[V][V]) {
int parent[V]; 
int key[V], i, v, count; 
int mstSet[V]; 
for (i = 0; i < V; i++)
key[i] = INT_MAX, mstSet[i] = 0;
key[0] = 0; 
parent[0] = -1; 
for (count = 0; count < V - 1; count++) {
int u = minKey(key, mstSet);
mstSet[u] = 1;
for (v = 0; v < V; v++)
if (graph[u][v] && mstSet[v] == 0 && graph[u][v] < key[v])
parent[v] = u, key[v] = graph[u][v];
}
printMST(parent, V, graph);
}
int main() {
int graph[V][V] = { 
{0, 8, 0, 0, 0, 10, 0, 4}, 
{8, 0, 4, 0, 10, 7, 0, 9},
{0, 4, 0, 3, 0, 3, 0, 0}, 
{0, 10, 0, 25, 0, 2, 7, 0}, 
{0, 10, 25, 0, 2, 7, 0},
{10, 7, 3, 18, 2, 0, 0, 0},
{0, 0, 0, 2, 7, 0, 0, 3},
{4, 9, 0, 0, 0, 0, 3, 0}};
primMST(graph);
return 0;
}  
