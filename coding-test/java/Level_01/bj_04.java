/*
    문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
    번호 : 10869
    조건 : 1 <= A, B <= 10,000
    출처 : BaekJoon
*/

import java.util.Scanner;

public class bj_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p, m, x, d, r = 0;
        if (1 <= a && b <= 10000) {
              p = a + b;
            m = a - b;
            x = a * b;
            d = a / b;
            r = a % b;
            System.out.println(p);
            System.out.println(m);
            System.out.println(x);
            System.out.println(d);
            System.out.println(r);
        }
    }
}
