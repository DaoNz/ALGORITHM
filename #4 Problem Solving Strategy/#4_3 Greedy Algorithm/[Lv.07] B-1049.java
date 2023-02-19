import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int set = 1000;
        int single = 1000;
        for (int i = 0; i < M; i++) {
            set = Math.min(set, sc.nextInt());
            single = Math.min(single, sc.nextInt());
        }
        int onlySingle = single*N;
        int onlySet = set*((N/6) +1);

        int res = 0;
            while (N > 0) {
                if (N >= 6) {
                    res += set;
                    N -= 6;
                } else {
                    res += single;
                    N--;
                }
            }
        System.out.println(Math.min(res, Math.min(onlySet, onlySingle)));
    }
}
