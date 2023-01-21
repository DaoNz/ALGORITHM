import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자 개수
        int M = sc.nextInt(); // 답 출력 횟수
        int start = 0, over = 0;
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        int[] res = new int[M];
        
        for(int i=1; i<=N; i++)
            arr[i] = sc.nextInt();
        
        dp[1] = arr[1];
        
        for(int i=2; i<=N; i++) 
            dp[i] = dp[i-1] + arr[i];
        
        for(int i=0; i<M; i++) {
            start = sc.nextInt();
            over = sc.nextInt();
            res[i] = dp[over] - dp[start-1];
        }
        
        for (int i : res)
            System.out.print(i + "\n");
        
    }
}
