#include <stdio.h>

int main() {
    int a;
    printf("출력할 단수를 입력하시오: ");
    scanf("%d", &a);
    for (int i = 1; i <= 10; i++) { 
        printf("%d x %d = %d\n", a, i, (a * i));
    }
}
//실수1 : int i; 이렇게만 선언했음 이렇게 하면 
// i의 값이 초기화되지 않아서 **쓰레기 값(이전에 메모리에 남아 있던 임의의 값)**이 들어갈 수도 있어.

//실수2 : \n으로 항을 이어서 표현함

