""" import sys
input = sys.stdin.readline

while True:
    line = input()
    if not line:   # EOF
        break

    a, b = map(int, line.split())
    print(a + b) """

import sys
input = sys.stdin.readline

while True:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except:
        break
