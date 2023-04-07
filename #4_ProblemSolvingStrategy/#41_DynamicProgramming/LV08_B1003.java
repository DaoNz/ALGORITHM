package DynamicProgramming;

import java.util.Scanner;

public class LV08_B1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] cases = new int[T];
        int max = 0;

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            cases[i] = n;
            max = Math.max(n, max);
        }

        int[] zero = new int[max+1];
        int[] one = new int[max+1];

        zero[0] = 1;
        one[0] = 0;

        for (int i = 1; i <= max; i++) {
            zero[i] = one[i-1];
            one[i] = zero[i-1] + one[i-1];
        }

        for(int i : cases)
            System.out.printf("%d %d\n", zero[i], one[i]);
    }
}
