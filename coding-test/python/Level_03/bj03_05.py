'''
문제 : 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
번호 : 25314
조건 : long int는 
    4바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는 
    8바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다.
출처 : BaekJoon
'''
n = int(input())
value = ''
for i in range(0 , n//4):
    value += "long "
value += "int"
print(value)