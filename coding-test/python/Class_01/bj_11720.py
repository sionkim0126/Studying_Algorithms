'''
문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
번호 : 11720
조건 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
        입력으로 주어진 숫자 N개의 합을 출력한다.
출처 : BaekJoon
'''
n = int(input())
m = input()
sum = 0
if n >= len(m):
    for i in range(len(m)):
       sum += int(m[i])
else:
    print("len over!!")
print(sum)

'''
N = int(input())
A = list(map(int, list(input())))
print(sum(A))
'''