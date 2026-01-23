/*
문제 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
번호 : 15552
조건 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
        다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
출처 : BaekJoon
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj03_06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String[] arr = br.readLine().split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            bw.write(sum + "\n");   // 문자열 + 개행
        }
        bw.flush();
        bw.close();
    }
}
