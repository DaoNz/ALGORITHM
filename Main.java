import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) q.offer(sc.nextInt());

		for (int i = 1; i <= N; i++) {
			st.push(i);
			sb.append("+\n");
			while (!st.isEmpty() && !q.isEmpty() && Objects.equals(st.peek(), q.peek())) {
				st.pop();
				q.poll();
				sb.append("-\n");
			}
		}
		if (!st.isEmpty() || !q.isEmpty()) System.out.println("NO");
		else System.out.println(sb.toString());
	}
}
