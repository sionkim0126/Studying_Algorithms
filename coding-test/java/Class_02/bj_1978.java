/*
문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
번호 : 1978
조건 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
        주어진 수들 중 소수의 개수를 출력한다.
출처 : BaekJoon
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1978 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().split(" ");
            int count = 0;
            for(int i = 0; i < n; i++){
                int num = Integer.parseInt(numbers[i]);
                        
                if(num == 1) continue;
                        
                boolean isPrime = true;
                        
                for(int j = 2; j < num; j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            
                if(isPrime){
                    count++;
                }
            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
