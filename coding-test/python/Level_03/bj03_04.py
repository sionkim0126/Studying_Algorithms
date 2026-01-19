'''
문제 : 영수증
번호 : 25304
조건 : 구매한 각 물건의 가격과 개수
    구매한 물건들의 총 금액
    을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
출처 : BaekJoon
'''
total = int(input())
n = int(input())
for i in range(0, n):
    amount, num = map(int, input().split(" "))
    total -= (amount * num)
if total == 0:
    print("Yes")
else:
    print("No")