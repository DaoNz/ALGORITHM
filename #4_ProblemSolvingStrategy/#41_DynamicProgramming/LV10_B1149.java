import java.util.Scanner;

public class LV10_B1149 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[][] arr = new int[N][3];
			
			for(int i=0; i<N; i++) 
				for(int j=0; j<=2; j++) 
					arr[i][j] = sc.nextInt();

			for(int i=1; i<N; i++) 
				for (int j=0; j<=2; j++) 
							 if (j == 0)
						arr[i][j] = Math.min(arr[i][j] + arr[i-1][1], arr[i][j] + arr[i-1][2]);
					else if (j == 1)
						arr[i][j] = Math.min(arr[i][j] + arr[i-1][0], arr[i][j] + arr[i-1][2]);
					else if (j == 2)
						arr[i][j] = Math.min(arr[i][j] + arr[i-1][0], arr[i][j] + arr[i-1][1]);
			
			int res = Math.min(arr[N-1][0], Math.min(arr[N-1][1], arr[N-1][2]));
			System.out.print(res);
			
		}
}
