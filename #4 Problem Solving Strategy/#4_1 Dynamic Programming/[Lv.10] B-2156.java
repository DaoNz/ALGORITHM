import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) arr[i] = sc.nextInt();

        dp[1] = arr[1];
        if (N >= 2) dp[2] = arr[1] + arr[2];
        if (N >= 3) for (int i = 3; i <= N; i++) {
            int compare = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
            dp[i] = Math.max(compare, dp[i - 1]);
        }

        System.out.println(dp[N]);
    }
}
