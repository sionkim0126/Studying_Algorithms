def factorial(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

N, K = map(int, input().split())

result = factorial(N) // (factorial(K) * factorial(N - K))
print(result)

""" 
import math
N, K = map(int, input().split())
print(math.factorial(N) // (math.factorial(K) * math.factorial(N-K)))
"""