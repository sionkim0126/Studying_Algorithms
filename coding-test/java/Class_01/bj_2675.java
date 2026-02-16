/*
문제 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
        즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
        QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
번호 : 2675
조건 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
        각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2675 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            for(int i = 0; i < t; i++){
                String[] arr = br.readLine().split(" ");
                int a = Integer.parseInt(arr[0]);
                String b = arr[1];
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < b.length(); j++){
                    char c = b.charAt(j);
                    for(int k = 0; k < a; k++){
                        sb.append(c);
                    }
                }
                System.out.println(sb.toString());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}