'''
문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
번호 : 11654
조건 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
출처 : BaekJoon
'''
a = input()
print(ord(a))
'''
s = "Hello"
ascii_list = [ord(c) for c in s]
print(ascii_list)  # [72, 101, 108, 108, 111]
'''