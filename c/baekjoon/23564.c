#include<stdio.h>
#include<malloc.h>
#include<stdbool.h>

#define size 1048576

struct answer {
	char* S;
	int A[size];
};

int calcLen(char* arr);
void SandARecursion(int n, char* string, int len);

struct answer ans;
int pattern[size];

int main() {
	int len, cnt;
	char string[size];

	scanf("%s", string);
	len = calcLen(string);

	ans.S = (char*)malloc(sizeof(char) * len);

	SandARecursion(0, string, len);
	cnt = calcLen(ans.S);

	printf("%s\n", ans.S);
	for (int i = 0; i < cnt; i++) {
		printf("%d", ans.A[i]);
		if (i != cnt - 1) printf(" ");
	}

	return 0;
}

int calcLen(char* arr) {
	int len = 0;

	for (int i = 0; i < size; i++) {
		if (arr[i] != '\0') len++;
		else break;
	}

	return len;
}

void SandARecursion(int n, char* string, int len) {
	if (n == 0) {
		int a1 = 0;
		ans.S[0] = string[0];
		for (int i = 0; i < len; i++) {
			if (ans.S[0] != string[i]) break;
			a1++;
		}
		ans.A[0] = a1;
		pattern[n] = a1;
		SandARecursion(n + 1, string, len);
	}
	else if (n > 0) {
		int term;
		term = pattern[n - 1];
		ans.S[n] = string[term];

		int an = 0;
		for (int i = term; i < len; i += (term + 1)) {
			// printf("%c\n", string[8]);
			// printf("%d %c %d %d~$$~\n", term, string[i], len, i);
			if (ans.S[n] == string[i]) {
				an++;
			}
			else {
				break;
			}
		}
		ans.A[n] = an;
		pattern[n] = an + (an + 1) * pattern[n - 1];
		if (term < len)
			SandARecursion(n + 1, string, len);
	}
}