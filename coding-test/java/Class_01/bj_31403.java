/*
문제 : JavaScript에서 +, -은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다. 
        하지만 문자열에 대해서 +는 두 문자열을 이어붙이라는 의미이고, -는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
        A, B, C를 각각 수와 문자열로 생각했을 때 A+B-C를 출력하세요.
번호 : 31403
조건 : 첫 줄에는 정수 A가 주어집니다. (1 \le A \le 1\,000)
        둘째 줄에는 정수 B가 주어집니다. (1 \le B \le 1\,000)
        셋째 줄에는 정수 C가 주어집니다. (1 \le C \le 1\,000)
        주어지는 모든 수는 0으로 시작하지 않는 양의 정수입니다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_31403 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String a = br.readLine();
            String b = br.readLine();
            int c = Integer.parseInt(br.readLine());
            int result2 = Integer.parseInt(a+b)-c;
            int result1 = Integer.parseInt(a) + Integer.parseInt(b) - c;
            System.out.println(result1);
            System.out.println(result2);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
