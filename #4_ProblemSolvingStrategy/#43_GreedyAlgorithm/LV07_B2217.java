import java.util.Arrays;
import java.util.Scanner;

public class LV07_B2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		
		for(int i=1; i<=N; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int max = 0;
		for(int i=1; i<=N; i++)
			max = Math.max(max, i*arr[N-i+1]);
		
		System.out.println(max);
		
	}
}
