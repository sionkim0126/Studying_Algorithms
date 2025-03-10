#include <stdio.h>

int d[101], dt[101]; // 크기를 101로 변경 (n이 최대 100일 때도 안전하게 동작)

int main() {
    int i, j, n, ans = 0, s;
    
    // 배열 크기 입력
    scanf("%d", &n);
    
    // 배열 입력 (인덱스를 0부터 사용)
    for(i = 0; i < n; i++) {
        scanf("%d", &d[i]);
    }
    
    // 누적합 계산 (dt[0]을 0으로 초기화)
    dt[0] = 0;
    for(i = 1; i <= n; i++) { // i = 1부터 시작해야 dt[i-1]이 존재함
        dt[i] = dt[i - 1] + d[i - 1];
    }
    
    // 부분 합을 이용한 최대 부분 배열 합 계산
    for(i = 1; i <= n; i++) {  
        for(j = i; j <= n; j++) {  
            s = dt[j] - dt[i - 1]; // 부분 합 계산
            if(s > ans) {
                ans = s;
            }
        }
    }
    
    // 결과 출력
    printf("%d\n", ans);
    
    return 0;
}
