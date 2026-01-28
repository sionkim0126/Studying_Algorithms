/*
문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
번호 : 10818
조건 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj04_03 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int max = Integer.parseInt(input[0]);
            int min = Integer.parseInt(input[0]);
            for(int i = 1; i < n; i++){
                int t = Integer.parseInt(input[i]);
                if(t > max){
                    max = t;
                }
                if(t < min){
                    min = t;
                }
                

            }
            System.out.println(max +" "+ min);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
