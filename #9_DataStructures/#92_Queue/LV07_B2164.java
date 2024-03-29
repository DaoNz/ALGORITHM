import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LV07_B2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> deq = new LinkedList<>();
        for (int i = 1; i <= N; i++) deq.offer(i);

        while (deq.size() != 1) {
            deq.poll();
            deq.offer(deq.poll());
        }
        System.out.print(deq.poll());
    }
}
