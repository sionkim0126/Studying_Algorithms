'''
문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
번호 : 10869
조건 : 1 <= A, B <= 10,000
출처 : BaekJoon
'''
a,b = map(int, input().split())
p = 0
m = 0
x = 0
d = 0
r = 0
if(1 <= a and b <= 10000):
    p = a + b
    m = a - b
    x = a * b
    d = a // b
    r = a % b
    print(p)
    print(m)
    print(x)
    print(d)
    print(r)