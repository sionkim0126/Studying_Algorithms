'''
문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
번호 : 9498
조건 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
출처 : BaekJoon
'''
score = int(input())
if(0 <= score <= 100):
    match score // 10:
        case 10 | 9 :
            print('A')
        case 8 :
            print('B')
        case 7 :
            print('C')
        case 6 :
            print('D')
        # default 말고 _ 사용
        case _:
            print("F")

        
