/*
문제 : 영수증
번호 : 25304
조건 : 구매한 각 물건의 가격과 개수
    구매한 물건들의 총 금액
    을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj03_04 {

    public static void main(String args[]){
        try{
            BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
            int total = Integer.parseInt(bu.readLine());
            int n = Integer.parseInt(bu.readLine());
            for(int i = 0; i < n; i++){
                String[] arr = bu.readLine().split(" ");
                int amount = Integer.parseInt(arr[0]);
                int num = Integer.parseInt(arr[1]);
                total -= (amount * num);
            }
            if(total == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}