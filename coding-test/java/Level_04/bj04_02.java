/*
문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
번호 : 10871
조건 : 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class bj04_02 {

    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] nx = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int[]a = new int[n];
            List<Integer> a1 = new ArrayList<>();
            int x = Integer.parseInt(nx[1]);
            String[] input = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                a[i] = Integer.parseInt(input[i]);
                if(a[i] < x){
                    a1.add(a[i]);
                }
            }
            if(a1.size() > 0){
                for(int i : a1){
                    bw.write(i + " ");
                }
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
더 간단한 풀이 방법
for(int i = 0; i < n; i++){
    int v = Integer.parseInt(input[i]);
    if(v < x){
        bw.write(v + " ");
    }
}
*/