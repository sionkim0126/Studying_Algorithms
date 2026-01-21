'''
문제 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
번호 : 15552
조건 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
        다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
출처 : BaekJoon
'''
import sys

input = sys.stdin.readline

t = int(input())
out = []

for _ in range(t):
    a, b = map(int, input().split())
    out.append(str(a + b))

sys.stdout.write("\n".join(out))

""" import sys

data = sys.stdin.read().split()
t = int(data[0])
idx = 1

out = []
for _ in range(t):
    a = int(data[idx])
    b = int(data[idx + 1])
    idx += 2
    out.append(str(a + b))

sys.stdout.write("\n".join(out))
 """