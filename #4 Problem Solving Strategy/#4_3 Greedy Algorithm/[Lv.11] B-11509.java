import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int size = 1;
		for(int i=0; i<N; i++) {
			int H = sc.nextInt();
			if(i==0) {
				arr.add(H);
				continue;
			} else {
				for(int j=0; j<arr.size(); j++) {
					if(arr.get(j) == H+1) {
						arr.set(j, H);
						break;
					}
					if(j+1==arr.size()) {
						arr.add(H);
						break;
					}
				}
			}
		}
		System.out.println(arr.size());			
	}
}
