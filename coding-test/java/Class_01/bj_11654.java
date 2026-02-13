/*
문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
번호 : 11654
조건 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11654 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String a =br.readLine();
            int b = (int) a.charAt(0);

            System.out.println(b);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}