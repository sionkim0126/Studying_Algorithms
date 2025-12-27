'''
문제 : A + B + C를 계산할 차례이다!
번호 : 11382
조건 : A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다. A+B+C의 값을 출력한다.
출처 : BaekJoon
'''
a,b,c = map(int, input().split())
# 정석 if문
if 1 <= a <= 10**12 and 1 <= b <= 10**12 and 1 <= c <= 10**12: 
    print(a + b + c)