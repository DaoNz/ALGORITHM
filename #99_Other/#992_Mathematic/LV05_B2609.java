package Math;

import java.util.Scanner;

public class LV05_B2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int L = 0;

        for (int i = 1; i <= Math.max(N,M); i++)
            if(N%i == 0 && M%i == 0) L = i;

        int G = (N*M/L);

        System.out.println(L);
        System.out.println(G);

    }
}
