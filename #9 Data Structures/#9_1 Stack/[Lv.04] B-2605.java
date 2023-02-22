import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> mainSt = new Stack<>();
        Stack<Integer> subSt = new Stack<>();
        int N = sc.nextInt();
        int X = sc.nextInt();
        mainSt.push(1);

        for (int i = 2; i <= N; i++) {
            int P = sc.nextInt();

            for (int j = 0; j < P; j++) subSt.push(mainSt.pop());
            mainSt.push(i);
            for (int j = 0; j < P; j++) mainSt.push(subSt.pop());
        } 
        for(int i : mainSt) System.out.printf("%d ", i);
    }
}

