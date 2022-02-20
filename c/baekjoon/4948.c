#include<stdio.h>
#include<malloc.h>
#include<stdbool.h>
#include<math.h>
// 4948 베르트랑 공준

bool isPrime(int n) {
	bool flag = true;
	int l = (int)sqrt(n);
	for (int i = 2; i <= l; i++) {
		if (n % i == 0) {
			flag = false;
			break;
		}
	}

	return flag;
}

int main() {
	int n;

	for (;;) {
		scanf("%d", &n);
		if (n == 0) {
			break;
		}
		else if (n == 1) printf("1\n");
		else {
			int n2 = 2 * n, cnt = 0;
			for (int i = n + 1; i <= n2; i++) {
				if (isPrime(i)) {
					cnt++;
				}
			}
			printf("%d\n", cnt);
		}
	}

	return 0;
}