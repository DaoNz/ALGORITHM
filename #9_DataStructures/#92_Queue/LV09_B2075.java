import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class LV09_B2075 {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();
		int N = Integer.parseInt(rd.readLine());

		for (int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(rd.readLine());
			for (int j = 0; j < N; j++) arr.add(Integer.parseInt(token.nextToken()));
		}
		Collections.sort(arr);
		System.out.println(arr.get(arr.size()-N));
	}
}