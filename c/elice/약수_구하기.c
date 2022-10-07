#include <stdio.h>

void calculate_divisor(int n) {
  if (n < 1) {
    return;
  }
  for (int i = 1; i <= n; i++) {
    if (n % i == 0)
      printf("%d ", i);
  }
}

void solve(int n) {
  calculate_divisor(n);
}

int main(void) {
  int n;
  scanf("%d", &n);

  solve(n);

  return 0;
}