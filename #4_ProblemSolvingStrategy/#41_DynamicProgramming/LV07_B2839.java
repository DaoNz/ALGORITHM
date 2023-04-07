import java.util.Scanner;

public class LV07_B2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int f = N/5;
		int t = N/3;
		int res = N;
    
		for(int i=0; i<=f; i++)
			for(int j=0; j<=t; j++)
				if ((5*i) + (3*j) == N)
					res = Math.min(res, i+j);
    
		if(res == N) res = -1;
		System.out.println(res);
	}
}
