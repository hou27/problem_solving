#include<stdio.h>
#include<malloc.h>

// 수 정렬하기 2

// 병합정렬 사용함

void merge(int* arr, int p, int q, int end);

void mergeSort(int* arr, int start, int end);

int main() {
  int N;

  scanf("%d", &N);

  int* arr = (int*)malloc(sizeof(int) * N);

  for (int i = 0; i < N; i++)
    scanf("%d", &arr[i]);

  mergeSort(arr, 0, N - 1);

  for (int i = 0; i < N; i++)
    printf("%d\n", arr[i]);

  free(arr);

  return 0;
}

void merge(int* arr, int p, int q, int r) {
  int pa = p;
  int pb = q + 1;
  int pc = 0;
  int* forWork = (int*)malloc(sizeof(int) * (r - p + 1));

  while (pa <= q && pb <= r) {
    if (arr[pa] <= arr[pb])
      forWork[pc++] = arr[pa++];
    else
      forWork[pc++] = arr[pb++];
  }

  while (pa <= q)
    forWork[pc++] = arr[pa++];

  while (pb <= r)
    forWork[pc++] = arr[pb++];

  pc = 0;
  while (p <= r)
    arr[p++] = forWork[pc++];

  free(forWork);
}

void mergeSort(int* arr, int start, int end) {
  int center;

  if (start < end) {
    center = (start + end) / 2;
    mergeSort(arr, start, center);
    mergeSort(arr, center + 1, end);
    merge(arr, start, center, end);
  }
}