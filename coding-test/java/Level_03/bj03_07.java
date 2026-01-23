/*
문제 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
번호 : 11021
조건 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj03_07 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {    
            int t = Integer.parseInt(br.readLine());
            for(int i = 1; i <= t; i++){
                String[] arr = br.readLine().split(" ");
                int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
                bw.write("Case #"+ i +": " + sum + "\n");
                // System.out.println("Case #"+ i +": " + sum);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}