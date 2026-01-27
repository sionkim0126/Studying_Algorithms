/*
문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
번호 : 10807
조건 : 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        둘째 줄에는 정수가 공백으로 구분되어져있다. 
        셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj04_01 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int[] arr =  new int[n];
            String[] input = br.readLine().split(" ");
            int v = Integer.parseInt(br.readLine());
            int f = 0;
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(input[i]);
                if(arr[i] == v){
                    f++;
                }
            }
            bw.write(String.valueOf(f));
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
