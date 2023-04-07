import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class LV06_B10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

	    ArrayList<Integer> sang = new ArrayList<>();
		ArrayList<Integer> cards = new ArrayList<>();

		int N = Integer.parseInt(rd.readLine());
	    StringTokenizer token = new StringTokenizer(rd.readLine());
	    for (int i = 0; i < N; i++) sang.add(Integer.parseInt(token.nextToken()));

		int M = Integer.parseInt(rd.readLine());
	    token = new StringTokenizer(rd.readLine());
		for (int i = 0; i < M; i++) cards.add(Integer.parseInt(token.nextToken()));

		Collections.sort(sang);

	    for (int i = 0; i < M; i++) {
		    if (Collections.binarySearch(sang, cards.get(i)) >= 0) sb.append("1 ");
			else sb.append("0 ");
	    }
	    System.out.println(sb);
    }
}