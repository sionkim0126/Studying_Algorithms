'''
문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
번호 : 10818
조건 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
출처 : BaekJoon
'''
n = int(input())
x = list(map(int, input().split(' ')))
s = x[0]
m = x[0]
for i in x:
    if i > m:
        m = i
    if i < s:
        s = i
print(s, m)
'''
import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

print(min(arr), max(arr))
'''