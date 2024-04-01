import java.util.*;

public class LV01_B10807 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
         }
        
        int M = sc.nextInt();
        for(int e : arr) {
            if (e == M) count++;
        }
        System.out.println(count);
    }
}
