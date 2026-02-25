'''
문제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
번호 : 2609
조건 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
        첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
출처 : BaekJoon
'''
a,b = map(int, input().split())
maxi = 0
for i in range(1, max(a,b)+1):
    if(a % i == 0 and b % i == 0):
        if(i > maxi):
            maxi = i
print(maxi)
result = (a*b)//maxi
print(result)