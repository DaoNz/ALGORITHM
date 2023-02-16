import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<String, String> map = new HashMap<>();
        StringTokenizer token = new StringTokenizer(rd.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(rd.readLine(), " ");
            map.put(token.nextToken(), token.nextToken());
        }

        for (int i = 0; i < M; i++)
            sb.append(map.get(rd.readLine())).append("\n");

        System.out.print(sb);
    }
}
