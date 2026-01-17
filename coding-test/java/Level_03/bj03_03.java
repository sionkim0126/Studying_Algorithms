/*
문제 : 1 부터 n까지의 합을 구하는 문제
번호 : 8393
조건 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj03_03 {
    public static void main(String[] args) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
