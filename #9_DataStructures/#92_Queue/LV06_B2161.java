import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LV06_B2161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> cards = new LinkedList<>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) cards.offer(i);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", cards.poll());
            cards.offer(cards.poll());
        }
        
    }
}
