'''
문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
번호 : 2751
조건 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 
        이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
출처 : BaekJoon
'''
# 기본풀이
import sys

input = sys.stdin.readline

n = int(input())

arr = []

for _ in range(n):
    arr.append(int(input()))

arr.sort()

for num in arr:
    print(num)

#기본 + sys.stdout.write
'''
import sys

input = sys.stdin.readline

n = int(input())

arr = []

for _ in range(n):
    arr.append(int(input()))

arr.sort()

for num in arr:
    sys.stdout.write(str(num) + "\n")
'''

#한 줄 풀이
'''
import sys

input = sys.stdin.readline

n = int(input())

arr = [int(input()) for _ in range(n)]

arr.sort()

print("\n".join(map(str, arr)))
'''