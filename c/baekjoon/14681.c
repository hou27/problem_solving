#include<stdio.h>

int main() {
    int a, b;

    scanf("%d", &a);
    scanf("%d", &b);

    // a, b > 0
    // a > 0, b < 0
    if(a > 0) {
        if(a*b > 0) printf("1");
        else printf("4");
    }
    // a, b < 0
    // a < 0, b > 0
    else {
        if(a*b > 0) printf("3");
        else printf("2");
    }

    return 0;
}