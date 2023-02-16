import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        HashSet<String> hear = new HashSet<>();
        ArrayList<String> who = new ArrayList<>();

        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < N; i++)
            hear.add(sc.next());

        for (int i = 0; i < M; i++) {
            String watch = sc.next();
            if(hear.contains(watch)) who.add(watch);
        }

        Collections.sort(who);

        sb.append(who.size()).append("\n");
        for(String str : who) sb.append(str).append("\n");

        System.out.print(sb);
    }
}
