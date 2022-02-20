#include<stdio.h>

int factorial(int n);

int main() {
	int n;

	scanf("%d", &n);

	n == 0 ? printf("1") : printf("%d", factorial(n));

	return 0;
}

int factorial(int n) {
	if (n > 1) return n * factorial(n - 1);
	return n;
}