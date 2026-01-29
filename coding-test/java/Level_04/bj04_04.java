/*
문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오
번호 : 2562
조건 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj04_04 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[9];
            int m = 0;
            int t = 0;
            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(br.readLine());
                if(arr[i]> m){
                    m = arr[i];
                    t = i+1;
                }
            }
            System.out.println(t +" "+ m);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}