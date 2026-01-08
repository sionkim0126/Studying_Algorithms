/*
문제 : 45분 일찍 알람 설정하기
번호 : 2884
조건 : 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
       입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj02_05 {
    public static void main(String[] args) {
        try{
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            String[] arr = bu.readLine().split(" ");
            int h = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);

            if(0 <= h && h <= 23){
                if(0 <= m && m <= 59 ){
                    if(m < 45){
                        m += 15;
                        h--;
                        if(h < 0){
                            h = 23;
                        }
                    }else{
                        m -= 45;
                    }
                    System.out.println(h + " " + m);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
