// KHAN MOHD OWAIS RAZA
// 20BCD7138
// CSE2001 Lab-9
// Challenging Question-3
#include <stdio.h>
#include <stdlib.h>
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
int i, j, k, a, b, u, v, n, ne = 1;
int min, mincost = 0, cost[9][9], parent[9];
int find(int);
int uni(int, int);
void main() {
printf("\nEnter the no. of vertices:");
scanf("%d", & n);
printf("\nEnter the adjacency matrix:\n");
for (i = 1; i <= n; i++) {
for (j = 1; j <= n; j++) {
scanf("%d", & cost[i][j]);
if (cost[i][j] == 0)
cost[i][j] = 999;
}}
printf("The edges of minimum spanning tree:\n");
while (ne < n) {
for (i = 1, min = 999; i <= n; i++) {
for (j = 1; j <= n; j++) {
if (cost[i][j] < min) {
min = cost[i][j];
a = u = i;
b = v = j;
}}}
u = find(u);
v = find(v);
if (uni(u, v)) {
printf("%d edge (%d,%d) =%d\n", ne++, a, b, min);
mincost += min;
}
cost[a][b] = cost[b][a] = 999;
}
printf("\n\tMinimum cost = %d\n", mincost);
getch();
}
int find(int i) {
while (parent[i])
i = parent[i];
return i;
}
int uni(int i, int j) {
if (i != j) {
parent[j] = i;
return 1;
}
return 0;
} 
