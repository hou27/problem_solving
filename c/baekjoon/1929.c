#include<stdio.h>
#include<stdbool.h>
#include<malloc.h> 
#include<math.h>

// 1929 소수 구하기

// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

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
	int M, N, cnt = 0;
	int* primeNum;


	scanf("%d %d", &M, &N);
	primeNum = (int*)malloc(sizeof(int) * (N - M));

	for (int i = M; i <= N; i++) {
		if (isPrime(i) && i != 1) { // 1이 소수가 아닌 것을 처리하지 않는 바람에 2번 틀림..
			primeNum[cnt] = i;
			cnt++;
		}
	}

	for (int i = 0; i < cnt; i++) {
		printf("%d\n", primeNum[i]);
	}

	free(primeNum);

	return 0;
}