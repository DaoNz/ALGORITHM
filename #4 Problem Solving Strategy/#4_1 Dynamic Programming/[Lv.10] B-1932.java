import java.util.Scanner;

public class B1932 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[][] tri = new int[501][501];
		
		for(int i=1; i<=N; i++)
			for(int j=1; j<=i; j++)
				tri[i][j] = sc.nextInt();

		for(int i=N; i>=1;i--)
			for(int j=1; j<=i; j++)
				tri[i][j] = Math.max(tri[i][j] + tri[i+1][j], tri[i][j] + tri[i+1][j+1]);
			
		System.out.println(tri[1][1]);

	}
	public static void aprint (int[][] tri, int N) {
		
		for(int i=1; i<N; i++) {
			for(int j=1; j<=i; j++)
				System.out.printf("%d  ",tri[i][j]);
		System.out.println();
		}
	}
}
