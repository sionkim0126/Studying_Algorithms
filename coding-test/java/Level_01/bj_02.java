/*
    문제 : 두수를 입력받은 다음, A*B를 출력하시오.
    번호 : 	10998
    조건 : 0 < A, B < 10
    출처 : BaekJoon
*/

import java.util.Scanner;

public class bj_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if(0 < a && b < 10){
            result = a * b;
            System.out.println(result);
        }
    }
}
