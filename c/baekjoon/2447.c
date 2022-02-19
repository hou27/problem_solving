#include <stdio.h>

// 2447 별 찍기
/**
 * 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
 * 크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
 *
 * ***
 * * *
 * ***
 * N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
 *
 * 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
 */
void starboxMaker(int row, int col, int N);

int main() {
	int N;
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			starboxMaker(i, j, N);
		}
		printf("\n");
	}

	return 0;
}

void starboxMaker(int row, int col, int N) {
	if ((row / N) % 3 == 1 && (col / N) % 3 == 1) {
		printf(" ");
	}
	else {
		if (N / 3 == 0) {
			printf("*");
		}
		else {
			// printf("%d %d\n", row, col);
			starboxMaker(row, col, N / 3);
		}
	}
}