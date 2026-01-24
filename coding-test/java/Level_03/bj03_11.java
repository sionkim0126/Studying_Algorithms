/*
문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
번호 : 10952
조건 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        입력의 마지막에는 0 두 개가 들어온다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj03_11 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = 2;
            for(int i = 1; i < n; i++){
                String[] arr2 = br.readLine().split(" ");
                int c = Integer.parseInt(arr2[0]);
                int d = Integer.parseInt(arr2[1]);
                if(c == 0 && d == 0){
                    n = 0;
                }else{

                    bw.write(c + d + "\n");
                    n++;
                }
            }
            bw.flush();

            /*
            while (true) {
                    String[] arr = br.readLine().split(" ");
                    int a = Integer.parseInt(arr[0]);
                    int b = Integer.parseInt(arr[1]);
            
                    if (a == 0 && b == 0) break;
            
                    bw.write((a + b) + "\n");
            }
            bw.flush();
              */
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
