import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LV07_B11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(rd.readLine());
        int[] data = new int[N];
        int res = 0;

        StringTokenizer token = new StringTokenizer(rd.readLine(), " ");
        for (int i = 0; i < N; i++)
            data[i] = Integer.parseInt(token.nextToken());

        Arrays.sort(data);

        for (int i = 0; i < N; i++) {
            res += (data[i]*(N-i));
        }
        System.out.print(res);
    }
}
