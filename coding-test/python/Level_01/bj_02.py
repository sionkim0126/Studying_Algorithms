'''
    문제 : 두수를 입력받은 다음, A*B를 출력하시오.
    번호 : 10998
    조건 : 0 < A, B < 10
    출처 : BaekJoon
'''
a,b = map(int, input().split())
result = 0
if(0 < a and b < 10):
    result = a * b
    print(result)