import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("<");
        int N = sc.nextInt();
        int M = sc.nextInt();

        Deque<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) que.offer(i);

        while(!que.isEmpty()) {
            for (int i = 0; i < M; i++) que.offerLast(que.pollFirst());
            sb.append(que.pollLast());
            if (!que.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.print(sb);

    }
}
