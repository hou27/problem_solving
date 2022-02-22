#include <stdio.h>
#include <string.h>

int main() {
	int T, q = 0;
	int state[9][2] = { {7, 1},{2, 8},{3, 8},{3, 4},{7, 5},{6, 5},{3, 0},{8, 0},{8, 8} };
	char N[205] = "";

	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%s", N);

		q = 0;

		for (int i = 0; i < strlen(N); i++) q = state[q][N[i]];

		q == 0 || q == 4 || q == 5 ? printf("YES\n") : printf("NO\n");
	}

	return 0;
}