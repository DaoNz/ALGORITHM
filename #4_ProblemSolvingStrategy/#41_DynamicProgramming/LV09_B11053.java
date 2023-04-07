import java.util.Scanner;

public class LV09_B11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] re = new int[N];

		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			re[i] = 1;
		}
        
		int res = 1;
        
		for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) re[i] = Math.max(re[i], re[j]+1);
            }
            res = Math.max(res, re[i]); 
        }
        System.out.print(res);
	}
}
