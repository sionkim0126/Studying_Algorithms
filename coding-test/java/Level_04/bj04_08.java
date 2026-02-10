/*
문제 : 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오
번호 : 3052
조건 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
        첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bj04_08 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> b = new HashMap<>();
        int count = 0;
        for(int j = 0; j < 10; j++){
            b.put(j, 0);
        }
        for(int i = 0; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            int c = a % 42;
            if(c > 0){
                //여기가 문제!! 
                // 중복된 값이 되는 나머지가 나온다면 문제 발생 >  i가 1일 때 a = 43이면 c = 1 , i가 2일 때 a가 43이면 c = 1 그럼 중복을 처리 못함
                b.put(i, b.get(i)+1);
            }
        }
        for(int i = 0; i < 10; i++){
            if(b.get(i) > 0){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class bj04_08 {
    public static void main(String[] args) throws Exception {
        //set을 이용한 문제 풀이
        //set이란? > = 중복을 허용하지 않는 자료구조!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            set.add(n % 42);
        }

        System.out.println(set.size());
    }
}

*/