#include <stdio.h>

int main() {
    int a;
    printf("출력할 단수를 입력하시오: ");
    scanf("%d", &a);
    for (int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", a, i, (a * i));
    }

    int b;
    scanf("%d" ,&b);
    printf("%d는 입력받은 수 입니다." , b);
}