#내가 작성해본 구구단 
'''print('원하는 단수를 입력하시오: ')
a = int(input())
for i in range(1, 11):
    print( a,'X', i,'=', a*i)'''
#피드백
#입력 안내문을 input() 안에 넣으면 더 깔끔함 -> a = int(input("원하는 단수를 입력하시오: "))
#print()와 input()을 따로 사용하지 않고 한 줄로 입력받을 수 있음.

#사용자가 숫자가 아닌 값을 입력하면 오류 발생 가능
#try-except를 사용해 예외 처리를 추가하면 더 안전함.

#출력 포맷을 f-string으로 하면 더 가독성이 좋아짐
#'{} X {} = {}'.format() 방식보다 f"{a} X {i} = {a * i}"가 더 직관적.
try:
    a = int(input("원하는 단수를 입력하시오: "))
    for i in range(1, 11):
        print(f"{a} x {i} = {a * i}")
except ValueError :
    print("숫자를 입력해야 합니다.")

# 후기: 파이썬 문법 및 f-string에 대해 다시 공부하기