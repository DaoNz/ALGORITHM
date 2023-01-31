import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            int K = sc.nextInt();
            String S = sc.next();

            if(!map.containsKey(K))
                map.put(K, new ArrayList<>());
            map.get(K).add(S);
        }

        for(int i : map.keySet())
            keys.add(i);

        for(int i : keys) {
            for (String s : map.get(i)) {
                System.out.printf("%d %s\n",i,s);
            }
        }
    }
}
