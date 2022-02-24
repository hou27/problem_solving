#include<stdio.h>
#include<malloc.h>

// 1033 칵테일
// 아직 못 품

typedef struct material {
	int line;
	int val;
}mtr;

long GCD(int a, int b);
int LCM(int a, int b);
void update(int idx, int val, int line, int cnt);


int N;
mtr material[10];

void main() {
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		material[i].val = 1;
	}

	for (int i = 0; i < N - 1; i++) {
		int a, b, p, q;
		int gcd;
		int aVal, bVal;

		scanf("%d %d %d %d", &a, &b, &p, &q);
		material[a].line = i;
		material[b].line = i;
		gcd = (int)GCD(p, q);
		aVal = material[b].val * p / gcd;
		bVal = material[a].val * q / gcd;
		gcd = (int)GCD(aVal, bVal);
		update(a, aVal / gcd, i, 1);
		update(b, bVal / gcd, i, 1);
	}

	for (int i = 0; i < N; i++) printf("%d ", material[i].val);
}

long GCD(int a, int b) {
	while (b > 0) {
		long tmp = a;
		a = b;
		b = tmp % b;
	}
	return a;
}

int LCM(int a, int b) {
	return a * b / GCD(a, b);
}

void update(int idx, int val, int line, int cnt) {
	int branch = material[idx].line;
	material[idx].val *= val;
	material[idx].line = line;
	if (cnt == 1) {
		for (int i = 0; i < N; i++) {
			if (material[i].line = branch && i != idx) update(i, val, line, 2);
		}
	}
}