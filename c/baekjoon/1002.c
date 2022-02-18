#include<stdio.h>
#include<math.h>
#include<stdlib.h>

// 1002 터렛
// 조규현의 좌표 (x1, y1)
// 조규현이 계산한 류재명과의 거리 r1
// 백승환의 좌표 (x2, y2)
// 백승환이 계산한 류재명과의 거리 r2
// x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수

// 류재명이 있을 수 있는 좌표의 수를 출력

int main() {
    int T, rplus, rminus;
    int x1, y1, r1, x2, y2, r2;
    double d;

    scanf("%d", &T);

    for(int i = 0; i < T; i++) {
        scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
        rplus = r1 + r2;
        rminus = abs(r1 - r2);
        d = sqrt(pow((x1 - x2), 2) + pow((y1 - y2), 2));
        if(d > rplus || rminus > d) printf("0\n");
        else if(d < rplus && d > rminus) printf("2\n");
        else if(d == 0 && r1 == r2) printf("-1\n");
        else printf("1\n");
    }

    return 0;
}