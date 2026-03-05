/* 
문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
번호 : 2751
조건 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 
        이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
출처 : BaekJoon
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bj_2751 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                list.add(Integer.parseInt(br.readLine()));
            }
            Collections.sort(list);
           for(int num : list){
                bw.write(num + "\n");
            }

            bw.flush();
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/* 
// 배열 정렬
int[] arr = {5, 3, 1, 4, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

// List 정렬
List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
Collections.sort(list);
System.out.println(list); // [1, 2, 3, 4, 5]
*/
/* Arrays.sort(arr);
// Arrays.sort(arr, Collections.reverseOrder()); //내림차순  */