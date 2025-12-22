/*
    문제 : 두수를 입력받은 다음, A/B를 출력하시오.
    번호 : 1008
    조건 : 0 < A, B < 10
    출처 : BaekJoon
*/

import java.util.Scanner;

public class bj_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = 0;
        if(0 < a && b < 10){
            result = (double)a / b; // java에서 정수 / 정수는 정수이다!! 그래서 double으로 형 변환
            System.out.println(result);
        }
    }
}
