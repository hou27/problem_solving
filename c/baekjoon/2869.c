#include <stdio.h>

void main() {
	int A, B, V;
	scanf("%d %d %d", &A, &B, &V);

	int day;
	day = (V - B - 1) / (A - B) + 1;

	printf("%d\n", day);
}