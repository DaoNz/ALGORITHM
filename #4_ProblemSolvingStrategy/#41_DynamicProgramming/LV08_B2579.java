import java.util.Scanner;

public class LV08_B2579 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] st = new int[N+1];
		int[] dp = new int[N+1];
		
		for (int i=1; i<=N; i++) {
			st[i] = sc.nextInt();
		}
		
		dp[1] = st[1];
		dp[2] = st[1] + st[2];
		dp[3] = Math.max(st[1]+st[3], st[2]+st[3]);
		
		for (int i=4; i<=N; i++) {
			dp[i] = Math.max(dp[i-2] + st[i], dp[i-3] + st[i-1] + st[i]);
		}
		System.out.print(dp[N]);
	}
}
