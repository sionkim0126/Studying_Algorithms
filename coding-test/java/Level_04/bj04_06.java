import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj04_06 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int[] box = new int[m+1];
        for(int i = 1; i <= m; i++){
            box[i] = i;
        }
        for(int i = 1; i <= n; i++){
            String[] arr2 = br.readLine().split(" ");
            int a = Integer.parseInt(arr2[0]);
            int b = Integer.parseInt(arr2[1]);
            int c = 0;
            while(arr2 != null){
                c = box[a];
                box[a] = box[b];
                box[b] = c;
                break;
            }
        }
        for(int i = 1; i <= m; i++){
            System.out.print(box[i] + " ");
        }
    }
}
