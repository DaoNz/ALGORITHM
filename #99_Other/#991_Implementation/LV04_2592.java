import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LV04_2592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> countMod = new HashMap<>();
		int[] arr = new int[10];
		int ave = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			ave += arr[i];

			if (!countMod.containsKey(arr[i])) countMod.put(arr[i], 1);
			else countMod.put(arr[i], countMod.get(arr[i]) + 1);
			max = Math.max(max, countMod.get(arr[i]));
		}

		System.out.println(ave / 10);

		for (int m : countMod.keySet())
			if (countMod.get(m) == max) {
				System.out.println(m);
				break;
			}
		
	}
}