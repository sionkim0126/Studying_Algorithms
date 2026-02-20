/*
문제 : 2024년 2월 3일 개최 예정인 온사이트 그랜드 아레나에서는 참가자들에게 티셔츠 한 장과 펜 한 자루가 포함된 웰컴 키트를 나눠줄 예정입니다. 
        키트를 제작하는 업체는 다음과 같은 조건으로만 주문이 가능합니다.
        티셔츠는 S, M, L, XL, XXL, 그리고 XXXL의 6가지 사이즈가 있습니다. 티셔츠는 같은 사이즈의  T 장 묶음으로만 주문할 수 있습니다.
        펜은 한 종류로,  P 자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있습니다.
        총 N명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은 각각  S, M, L, XL, XXL, XXXL명입니다. 
        티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 합니다. 펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 합니다.
        티셔츠를 T 장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 P자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.
번호 : 30802
조건 : 첫 줄에 참가자의 수  N 이 주어집니다.  (1 <= N <= 10^9)  
        둘째 줄에 티셔츠 사이즈별 신청자의 수 
         S, M, L, XL, XXL, XXXL 이 공백으로 구분되어 주어집니다.  (0 <= S, M, L, XL, XXL, XXXL <= N;  
         S + M + L + XL + XXL + XXXL = N)  
        셋째 줄에 정수 티셔츠와 펜의 묶음 수를 의미하는 정수  T 와  P 가 공백으로 구분되어 주어집니다.(2 <= T, P <= 10^9)
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_30802 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            String[] tp = br.readLine().split(" ");
            int t =Integer.parseInt(tp[0]);
            int p =Integer.parseInt(tp[1]);
            int tr = 0;
            for (int i = 0; i < a.length; i++) {
                    int b = Integer.parseInt(a[i]);
                            
                    tr += b / t; // 기본적으로 몫만큼 묶음을 더합니다. (b가 0이면 0 추가)
                            
                    if (b % t > 0) {
                        tr++; // 나머지가 존재하면(즉, 묶음으로 딱 떨어지지 않으면) 1묶음을 더 추가합니다.
                    }
                }
            int[] pr = new int[2];
            pr[0] = n/p;
            pr[1] = n%p;

            System.out.println(tr);
            System.out.println(pr[0]+" "+ pr[1]);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}