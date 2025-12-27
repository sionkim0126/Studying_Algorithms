/*
문제 : A + B + C를 계산할 차례이다!
번호 : 11382
조건 : A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다. A+B+C의 값을 출력한다.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_09 {

    public static void main(String[] args) throws Exception {
        /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();*/
        // 개념이해용 scanner는 공백 기준으로 알아서 나눔 결과적으로 한줄이든 두줄이든 상관없음
        // 실전정석은 BufferedReader + split
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //readLine() → IOException 발생 가능 그래서 throws 또는 try-catch 필수
        String[] arr = br.readLine().split(" ");

        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);

        System.out.println(a + b + c);


    }
}