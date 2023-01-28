import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> keys = new ArrayList<>();
        int last = 0, count = 0;
        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            int st = sc.nextInt();
            int ov = sc.nextInt();
            if(!map.containsKey(ov)) {
                map.put(ov, new ArrayList<>());
            }
            map.get(ov).add(st);
        }

        for(int i : map.keySet())
            keys.add(i);
        Collections.sort(keys);

        for(int i : keys) {
            Collections.sort(map.get(i));
            for(int j : map.get(i)) {
                if(j >= last) {
                    last = i;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
