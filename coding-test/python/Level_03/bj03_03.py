'''
문제 : 1 부터 n까지의 합을 구하는 문제
번호 : 8393
조건 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
출처 : BaekJoon
'''
n = int(input())
sum = 0
for i in range(1, n + 1) :
    sum += i
print(sum)