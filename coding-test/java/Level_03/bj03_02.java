/*
문제 : 각 테스트 케이스마다 A+B를 출력한다.
번호 : 10950
조건 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
       각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj03_02 {
    public static void main(String[] args) {
        try{
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(bu.readLine());
            for(int i = 0; i < t; i++){
                String [] arr = bu.readLine().split(" ");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                System.out.println(a + b);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
