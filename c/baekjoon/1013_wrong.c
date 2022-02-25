#include<stdio.h>
/**
(xyx)+ (  ) 는 괄호 내의 xyx의 반복으로 이루어진 전파의 집합

1+ = { 1, 11, 111, 1111, 11111, … }
10+ = { 10, 100, 1000, 10000, 100000, … }
(01)+ = { 01, 0101, 010101, 01010101, 0101010101, … }
(1001)+ = { 1001, 10011001, 100110011001, … }
10+11 = { 1011, 10011, 100011, 1000011, 10000011, … }
(10+1)+ = { 101, 1001, 10001, 1011001, 1001101, 100011011000001, … }

{ x | y } 는 x 혹은 y 를 의미하는 것으로, { 0+ | 1+ } 는 { 0 , 1 , 00 , 11 , 000 , 111 , … } 의 집합을 의미
(100 | 11)+ = { 100 , 11 , 10011 , 11100 , 1110011100 , 100111111100100, … }

(100+1+ | 01)+

T
(1 ≤ N ≤ 200)
 */

 // state 4에서 다시 state 3으로 넘어갈 수 있는 경우를 놓침..


void chk(char* N, int state, int location);

int main() {
  int T;
  char N[205];
  scanf("%d", &T);

  for (int i = 0; i < T; i++) {
    scanf("%s", N);
    chk(N, 0, 0);
  }

  return 0;
}

void chk(char* N, int state, int location) {
  if ((state == 4 || state == 6) && N[location] == '\0') {
    printf("YES\n");
    return;
  }
  else if (N[location] != '\0') {
    switch (state) {
    case 0:
      if (N[location] == '1') {
        chk(N, 1, location + 1);
      }
      else if (N[location] == '0') {
        chk(N, 5, location + 1);
      }
      break;
    case 1:
    case 2:
      if (N[location] == '1') {
        printf("NO\n");
      }
      else if (N[location] == '0') {
        chk(N, state + 1, location + 1);
      }
      break;
    case 3:
      if (N[location] == '1') {
        chk(N, 4, location + 1);
      }
      else if (N[location] == '0') {
        chk(N, 3, location + 1);
      }
      break;
    case 4:
      if (N[location] == '1') {
        chk(N, 4, location + 1);
      }
      else if (N[location] == '0') {
        chk(N, 5, location + 1);
      }
      break;
    case 5:
      if (N[location] == '1') {
        chk(N, 6, location + 1);
      }
      else if (N[location] == '0') {
        printf("NO\n");
      }
      break;
    case 6:
      if (N[location] == '1') {
        chk(N, 1, location + 1);
      }
      else if (N[location] == '0') {
        chk(N, 5, location + 1);
      }
      break;
    default:
      break;
    }
  }
  else printf("NO\n");
}