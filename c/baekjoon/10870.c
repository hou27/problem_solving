#include<stdio.h>

int fibonacci(int n);

int main() {
	int n;

	scanf("%d", &n);

	printf("%d", fibonacci(n));

	return 0;
}

int fibonacci(int n) {
	if (n >= 2) return fibonacci(n - 1) + fibonacci(n - 2);
	else if (n == 1) return 1;
	else return 0;
}