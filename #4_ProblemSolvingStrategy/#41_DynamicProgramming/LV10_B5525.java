import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LV10_B5525 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(rd.readLine());
        int M = Integer.parseInt(rd.readLine());
        String data = rd.readLine();

        int[] dp = new int[M];
        int res = 0;

        if (data.charAt(0) == 'I') dp[0] = 1;
        if (data.charAt(1) == 'I') dp[1] = 1;

        for (int i = 2; i < M; i++) {
            if (data.charAt(i - 1) == 'I' && data.charAt(i) == 'I') dp[i] = 1;
            else if (data.charAt(i - 2) == 'O' && data.charAt(i) == 'I') dp[i] = 1;
            else if (data.charAt(i - 2) == 'I' && data.charAt(i) == 'I') dp[i] = dp[i - 2] + 1;
            if (dp[i] > N) res++;
        }

//        System.out.println(data);
//        for (int i : dp) System.out.print(i);
//        System.out.println();
        System.out.print(res);
    }
}
