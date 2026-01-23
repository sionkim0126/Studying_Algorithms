'''
문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
번호 : 2439
조건 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
출처 : BaekJoon
'''
import sys
input = sys.stdin.readline
n = int(input())
for i in range(1, n+1):
    for j in range(0, n-i):
        sys.stdout.write(" ")
    for k in range(0, i):
        sys.stdout.write('*')
    sys.stdout.write('\n')