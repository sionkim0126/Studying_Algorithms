/*
문제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
번호 : 2741
조건 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2741 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            for(int i = 1; i <= a; i++){
                System.out.println(i);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
