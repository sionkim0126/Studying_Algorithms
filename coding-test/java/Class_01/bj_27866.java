/*
문제 : 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
번호 : 27866
조건 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
        둘째 줄에 정수 i가 주어진다. (1 <= i <= S.length)
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_27866 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());
            /* int a = str.indexOf(3);
            System.out.println(a); */
            char a = str.charAt(num-1);
            System.out.println(a);
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}