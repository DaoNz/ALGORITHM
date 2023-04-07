import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LV08_B1021 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> deq = new LinkedList<>();
        StringTokenizer token = new StringTokenizer(rd.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int res = 0;

        for (int i = 1; i <= N; i++) deq.offer(i);

        token = new StringTokenizer(rd.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(token.nextToken());
            int size = deq.size();
            int index = deq.indexOf(target);

            if (index > size / 2) {
                while (!(deq.getFirst() == target)) {
                    deq.offerFirst(deq.pollLast());
                    res++;
                }
            } else {
                while (!(deq.getFirst() == target)) {
                    deq.offerLast(deq.pollFirst());
                    res++;
                }
            }
            deq.pollFirst();
        }

        System.out.println(res);
    }
}
