/*
문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
번호 : 2439
조건 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj03_10 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            for(int i = 1; i <= n; i++){
                for(int j = 0; j < n-i; j++){
                    bw.write(" ");
                }
                for(int k = 0; k < i; k++){
                        bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
