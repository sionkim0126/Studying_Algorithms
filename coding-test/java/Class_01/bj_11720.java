/* 
문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
번호 : 11720
조건 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
        입력으로 주어진 숫자 N개의 합을 출력한다.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11720 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String ns = br.readLine();
            int sum = 0;
            if(n >= ns.length()){
                for(int i = 0; i < n; i++){
                    /* int x = ns.indexOf("3");
                    //특정 문자 위치 찾기 (indexOf 함수) */
                    
                    /* 
                    int x = ns.charAt(i)-'0';
                    chatAt는 char타입 반환 근데 Integer.parseInt메서드는 String타입을 원함
                        int x = ns.charAt(i)-'0';는 아스키코드로 숫자로 계산식으로
                        자바에서 char는 내부적으로 아스키 코드(정확히는 유니코드 숫자 값) 로 저장된다. 51 - 48 = 3으로 계산을 세움
                     */

                    int x = Integer.parseInt(String.valueOf(ns.charAt(i)));
                    /*String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
                        toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다. */
                    sum += x;
                }
            }else{
                System.out.println("length over!!");
            }
            System.out.println(sum);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}