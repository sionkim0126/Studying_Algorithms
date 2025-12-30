/*
문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.
번호 : 1330
조건 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj02_01 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] arr = br.readLine().split(" ");
    
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if(-10000 <= a && a <= 10000){
                if(-10000 <= b && b <= 10000){
                    if (a < b) {
                        System.out.println("<");
                    }else if(a > b){
                        System.out.println(">");
                    }else if(a == b){
                        System.out.println("==");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
