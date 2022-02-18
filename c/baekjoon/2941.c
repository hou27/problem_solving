#include<stdio.h>
#include<string.h>

int main() {
    char str[100];
    int len, res;
    
    scanf("%s", str);
    len = strlen(str);
    res = len;
    for(int i = 1; i < len; i++) {
        if(str[i] == 'j'&& ((str[i-1] == 'l' || str[i-1] == 'n'))) {
            res--;
        }
        else if(str[i] == '=' && (str[i-1] == 'c' || str[i-1] == 's' || str[i-1] == 'z')) {
            res--;
            if(i > 1 && str[i-1] == 'z' && str[i-2] == 'd') {
                res--;
            }
        }
        else if(str[i] == '-' && (str[i-1] == 'c' || str[i-1] == 'd')) {
            res--;
        }
    }

    printf("%d", res);

    return 0;
}
/*
č	c=
dž	dz=
š	s=
ž	z=

ć	c-
đ	d-

lj	lj
nj	nj
*/