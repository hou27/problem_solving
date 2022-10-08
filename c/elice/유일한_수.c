#include <stdio.h>

void solve(int* n, int len) {
  /* 여기에 코드를 작성해 주세요 */
  for (int i = 0; i < len; i++) {
    int count = 0;
    for (int j = 0; j < len; j++) {
      if (n[i] == n[j]) {
        count++;
      }
    }
    if (count == 1) {
      printf("%d ", n[i]);
    }
  }
}

int main() {
  int len;
  int n[20];
  int i;
  scanf("%d", &len);

  for (i = 0; i < len; i++)
  {
    scanf("%d", n + i);
  }

  solve(n, len);

  return 0;
}