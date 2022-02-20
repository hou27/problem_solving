#include<stdio.h>
#include<malloc.h>
#include<stdbool.h>

#define size 1048576

struct answer {
	char* S;
	int A[size];
};

int calcLen(char* arr);
char* getAlphabets(int len, char* alphabet, char* string);
void ARecursion(int n, char* string, int len, int cnt);

struct answer ans;

int main() {
	int len = 0, cnt = 0;
	char string[size];

	scanf("%s", string);
	len = calcLen(string);

	ans.S = (char*)malloc(sizeof(char) * len);

	ans.S = getAlphabets(len, ans.S, string);
	cnt = calcLen(ans.S);

	ARecursion(0, string, len, cnt);

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

char* getAlphabets(int len, char* alphabet, char* string) {
	int cnt = 0;
	bool exist = false;

	for (int i = 0; i < len; i++) {
		for (int j = 0; j <= cnt; j++) {
			if (string[i] == alphabet[j]) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			alphabet[cnt] = string[i];
			cnt++;
		}
		else exist = false;
	}

	return alphabet;
}

void ARecursion(int n, char* string, int len, int cnt) {
	if (n == 0) {
		int a1 = 0;
		for (int i = 0; i < len; i++) {
			if (ans.S[0] != string[i]) break;
			a1++;
		}
		ans.A[0] = a1;
		ARecursion(n + 1, string, len, cnt);
	}
	else if (n == cnt - 1) {
		int an = 0;

		for (int i = 0; i < len; i++) {
			if (ans.S[n] == string[i]) {
				an++;
			}
		}
		ans.A[n] = an;
	}
	else if (cnt - 1 > n && n > 0) {
		int an = 0, til;
		for (int i = 0; i < len; i++) {
			if (string[i] == ans.S[n + 1]) {
				til = i;
				break;
			}
		}
		for (int i = 0; i < til; i++) {
			if (ans.S[n] == string[i]) {
				an++;
			}
		}
		ans.A[n] = an;
		ARecursion(n + 1, string, len, cnt);
	}
}