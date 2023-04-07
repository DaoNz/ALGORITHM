import java.util.Arrays;
import java.util.Scanner;

public class LV07_B1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int res = 0;
            int low = 0;
            int high = arr.length-1;
            int find = sc.nextInt();

            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == find) {
                    res = 1;
                    break;
                }
                else if (find > arr[mid]) low = mid + 1;
                else if (find < arr[mid]) high = mid - 1;
            }
            System.out.println(res);
        }
    }
}
