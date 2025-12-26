/*
문제 : (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
번호 : 2588
조건 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
출처 : BaekJoon
*/
import java.util.Scanner;
public class bj_08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(100 <= a && a <= 999){
            if(100 <= b && b <= 999){
                System.out.println(a * (b%10));
                System.out.println(a * ((b/10)%10));
                System.out.println(a * (b/100));
                System.out.println(a * b);
            }
        }
    }
}