#include <stdio.h>
#include <string.h>
void main(){
char characters[10][8], tcharacters[10][8], temp[8];
int i, j, n;
printf("Enter the value of N \n");
scanf("%d", &n);
printf("Enter the %d characters \n", n);
for (i = 0; i < n; i++) {
scanf("%s", characters[i]);
strcpy(tcharacters[i], characters[i]);
}
for (i = 0; i < n - 1 ; i++){
for (j = i + 1; j < n; j++){
if (strcmp(characters[i], characters[j]) > 0) {
strcpy(temp, characters[i]);
strcpy(characters[i], characters[j]);
strcpy(characters[j], temp);
}}}
printf("\n---------------------------");
printf("\nInput Names    Sorted names");
printf("\n---------------------------\n");
for (i = 0; i < n; i++){
printf("%s\t\t%s\n", tcharacters[i], characters[i]);
}}


