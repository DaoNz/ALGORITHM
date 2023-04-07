import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LV11_B5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(rd.readLine());

        for (int i = 0; i < N; i++) {
            Boolean reverse = false;
            Boolean error = false;
            String method = rd.readLine();
            int size = Integer.parseInt(rd.readLine());
            StringTokenizer token = new StringTokenizer(rd.readLine(), "[],");
            // 여기까지 데이터 입력.

            Deque<Integer> Q = new LinkedList<>();
            for (int j = 0; j < size; j++) Q.add(Integer.parseInt(token.nextToken()));
            // 토큰들 덱에 저장.

            for (int j = 0; j < method.length(); j++) {
                if (method.charAt(j) == 'R') reverse = !reverse;
                else {
                    if (Q.isEmpty()) {
                        error = true;
                        sb.append("error").append("\n");
                        break;
                    } else if (!reverse) Q.pollFirst();
                    else Q.pollLast();
                }
            }

            if (!error) {
                if (!reverse) {
                    sb.append("[");
                    while (!Q.isEmpty()) {
                        sb.append(Q.pollFirst());
                        if (!Q.isEmpty()) sb.append(",");
                    }
                    sb.append("]").append("\n");
                }
                else {
                    sb.append("[");
                    while (!Q.isEmpty()) {
                        sb.append(Q.pollLast());
                        if (!Q.isEmpty()) sb.append(",");
                    }
                    sb.append("]").append("\n");
                }
            }

        }
        System.out.print(sb);
    }
}
