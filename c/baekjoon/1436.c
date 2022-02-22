#include<stdio.h>
#include<string.h>

// 1436 영화감독 슘

#define size 100

int main() {
	int N, cnt = 0, num = 666;
	char s[size];

	scanf("%d", &N);

	for (;;) {
		sprintf(s, "%d", num);
		if (strstr(s, "666") != NULL) {
			cnt++;
		}

		if (N == cnt) {
			printf("%d", num);
			break;
		}

		num++;
	}

	return 0;
}