#if 1
#include<stdio.h>

// 10989 counting sort(도수 정렬)

#define size 10005

int main() {
  int N, tmp;
  int f[size] = { 0, };

  scanf("%d", &N);

  // 도수 분포표 생성
  for (int i = 1; i <= N; i++) {
    scanf("%d", &tmp);
    f[tmp]++;
  }

  for (int i = 1; i <= 10000; i++) {
    for (int j = 0; j < f[i]; j++) {
      printf("%d\n", i);
    }
  }

  return 0;
}
#endif


// 메모리 초과 ver
#if 0
#include<stdio.h>
#include<malloc.h>

// 10989 counting sort(도수 정렬)

#define size 10005

int main() {
  int N;
  int f[size] = { 0, };

  scanf("%d", &N);
  int* nArr = (int*)malloc(sizeof(int) * (N + 1));
  int* result = (int*)malloc(sizeof(int) * (N + 1));

  // 도수 분포표 생성
  for (int i = 1; i <= N; i++) {
    scanf("%d", &nArr[i]);
    f[nArr[i]]++;
  }

  // 누적 도수 분포표 만들기
  for (int i = 2; i <= 10000; i++) {
    f[i] += f[i - 1];
  }

  // 새로운 배열에 정렬하여 배치
  for (int i = N; i >= 1; i--) {
    result[f[nArr[i]]] = nArr[i];
    f[nArr[i]]--;
  }

  for (int i = 1; i <= N; i++)
    printf("%d\n", result[i]);

  free(nArr);
  free(result);

  return 0;
}
#endif