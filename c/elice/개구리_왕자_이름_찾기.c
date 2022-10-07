#include <stdio.h>
#include<string.h>

char* isPrince(char frogs[100][100], int frogCount) {
  for (int i = 0; i < frogCount; i++) {
    if (index(frogs[i], 'F') == frogs[i]) {
      return frogs[i];
    }
  }
}

int main(void) {
  int frogCount;
  char frogs[100][100];
  int i;

  scanf("%d", &frogCount);

  for (i = 0; i < frogCount; i++) {
    scanf("%s", frogs[i]);
  }

  printf("%s", isPrince(frogs, frogCount));
  return 0;
}