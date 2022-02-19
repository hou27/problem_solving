#include<stdio.h>
#include<math.h>

// 11729 하노이 탑 이동 순서

void move(int n, int start, int goal) {
    if (n > 1) {
        move(n - 1, start, 6 - start - goal);
    }
    printf("%d %d\n", start, goal);
    if (n > 1) {
        move(n - 1, 6 - start - goal, goal);
    }
}

int main() {
    int N, cnt;

    scanf("%d", &N);
    cnt = pow(2, N) - 1;
    printf("%d\n", cnt);
    move(N, 1, 3);

    return 0;
}