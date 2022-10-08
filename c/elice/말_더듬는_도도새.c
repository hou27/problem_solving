#include <stdio.h>

void solve(char* str) {
  /* 여기에 코드를 작성해 주세요 */
  int count = 0;
  for (int i = 0; str[i] != '\0'; i++) {
    count++;
    for (int j = 0; j < count; j++) {
      printf("%c", str[j]);
    }
    printf("\n");
  }
}

int main() {
  char str[1001];
  scanf("%s", str);

  solve(str);

  return 0;
}