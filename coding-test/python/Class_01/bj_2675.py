'''
문제 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
        즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
        QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
번호 : 2675
조건 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
        각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
출처 : BaekJoon
T만큼 반복
    R, S 입력받기
    결과 문자열을 빈 문자열로 시작
    S의 각 문자에 대해
        그 문자를 R번 반복해서 결과에 붙이기
    결과 출력
'''
T = int(input())
for _ in range(T):
    R, S = input().split()
    R, S = int(R), list(S)
    for i in range(len(S)):
        print(f"{S[i]*R}", end="")
    print()