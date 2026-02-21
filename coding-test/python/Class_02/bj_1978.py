'''
문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
번호 : 1978
조건 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
        주어진 수들 중 소수의 개수를 출력한다.
출처 : BaekJoon
'''
n = int(input())
a = list(map(int, input().split()))

count = 0

for num in a:
    if num == 1:
        continue

    is_prime = True

    for j in range(2, int(num ** 0.5) + 1):
        if num % j == 0:
            is_prime = False
            break

    if is_prime:
        count += 1

print(count)