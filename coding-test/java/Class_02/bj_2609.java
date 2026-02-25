/*
문제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
번호 : 2609
조건 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
        첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2609 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(b > a){
                int temp = a;
                a = b;
                b = temp;
            }
            int maxi = 0;
            for(int i = a; i > 0; i--){
                if(a % i == 0 && b % i == 0){
                    if(i > maxi){
                        maxi = i;
                    }
                }
            }
            System.out.println(maxi);
            System.out.println((a*b)/maxi);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}