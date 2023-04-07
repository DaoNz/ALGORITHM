import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class LV06_B11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        int N = Integer.parseInt(rd.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(rd.readLine(), " ");
            String method = token.nextToken();
            int x = 0;

            if (token.hasMoreTokens()) x = Integer.parseInt(token.nextToken());

            switch (method) {
                case "add":
                    set.add(x);
                    break;

                case "remove":
                    set.remove(x);
                    break;

                case "check":
                    if (set.contains(x)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "toggle":
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;

                case "all":
                    set.addAll(list);
                    break;

                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}
