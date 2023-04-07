import java.util.Scanner;

public class LV07_B1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i < 100; i++) {
            cnt++;
            if (i == N) break;
        }

        for (int i = 100; i <= N; i++) {
            int hud = i/100;
            int ten = i%100/10;
            int one = i%10;
            if (one-ten == ten-hud) cnt++;
        }
        System.out.print(cnt);
    }
}
