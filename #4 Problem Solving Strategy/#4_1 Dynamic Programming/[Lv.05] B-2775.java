import java.util.Scanner;

// T  테스트 케이스
// K - 층수
// N - 호수

public class B2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int K, N;
		int[][] apt;
		int[] ans = new int[T];
    
		for (int i=1; i<=T; i++) {
			
			K = sc.nextInt();
			N = sc.nextInt();
			apt = new int[K+1][N+1];
			
			for(int x=0; x<=K; x++)
				apt[x][0] = 0;
			
			for(int y=0; y<=N; y++) 
				apt[0][y] = y;
			
			for(int a=1; a<=K; a++) {
				for (int b=1; b<=N; b++) {
					apt[a][b] = apt[a][b-1] + apt[a-1][b];
				}
			}
			ans[i-1] = apt[K][N];
		}
		for(int i : ans)
			System.out.println(i);
	}
}

