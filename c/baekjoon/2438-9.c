#if 0
// 2438
#include<stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < i + 1; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
#endif

#if 1
// 2439
#include<stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(j + 1 > n - i - 1) {
                printf("*");
            }
            else printf(" ");
        }
        printf("\n");
    }

    return 0;
}
#endif