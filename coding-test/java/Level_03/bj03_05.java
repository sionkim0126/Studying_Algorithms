/*
문제 : 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
번호 : 25314
조건 : long int는 
    4바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는 
    8바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj03_05 {

    public static void main(String[] args) throws Exception{
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bu.readLine());
        n = n/4;
        String value = "";

        for(int i = 0; i < n; i++){
            value += "long ";
            
        }
        value += "int";
        System.out.println(value);
    }
}
/*
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n / 4; i++){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb.toString());
*/