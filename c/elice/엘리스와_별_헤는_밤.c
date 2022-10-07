#include <stdio.h>

int main() {
  int starDistance;

  scanf("%d", &starDistance);

  /* 여기에 코드를 작성해 주세요. */
  for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) {
      for (int j = 0; j < starDistance; j++)
        printf(" ");
    }
    else {
      printf("*");
    }
  }
  printf("\n");
  if (starDistance % 2 == 0) {
    int firstBlank = starDistance + 2 - starDistance / 2 - 1;
    for (int i = 0; i < firstBlank; i++) {
      printf(" ");
    }
    printf("*");
    for (int i = 0; i < starDistance - 1; i++) {
      printf(" ");
    }
    printf("*");
  }
  else {
    for (int i = 0; i < (starDistance + 1) / 2; i++) {
      printf(" ");
    }
    printf("*");
    for (int i = 0; i < starDistance; i++) {
      printf(" ");
    }
    printf("*");
  }

  return 0;
}