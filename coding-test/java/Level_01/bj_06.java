/*
문제 : 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
번호 : 18108
조건 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
출처 : BaekJoon
*/
import java.util.Scanner;

public class bj_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(1000 <= y && y <= 3000){
            /*자바는 왼쪽부터 계산하는데
            처음 1000 <= y <= 3000라고 하면 왼쪽부터 계산 후 true <= 3000이 된다
            그래서 자바는 논리 연산자로 나누어서 식을 완성한다. */
            System.out.println(y - 543);
        }
    }
}
