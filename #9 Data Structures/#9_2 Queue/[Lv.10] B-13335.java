import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer token = new StringTokenizer(rd.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());    // 다리 건너는 트럭 수
        int W = Integer.parseInt(token.nextToken());   // 다리 길이
        int L = Integer.parseInt(token.nextToken());    // 다리 최대 하중

        Queue<Integer> truck = new LinkedList<>();
        token = new StringTokenizer(rd.readLine(), " ");
        while (token.hasMoreTokens()) truck.offer(Integer.parseInt(token.nextToken()));

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < W; i++) bridge.offer(0);

        int sum = 0; // 다리 현재 중량
        int res = 0; // 이동 수
        while (!bridge.isEmpty()) {
            if (!truck.isEmpty() && sum + truck.peek() <= L) { // 트럭이 남았는데 올라가도 다리가 버티면
                int tr = truck.poll();  // 트럭 준비
                int out = bridge.poll(); // 나갈 값 내보내면서 저장
                sum = sum - out + tr; // 현재 중량에서 나간 값 빼고 들어온 값 추가
                bridge.offer(tr); // 트럭 다리에 올려주기
                res++;
            } else { // 트럭이 남았는데 다리가 못버티면?
                sum = sum - bridge.poll();    // 내보내면서 다리 중량에서 삭제
                if (!truck.isEmpty() && sum + truck.peek() <= L) { // 빼봤는데 트럭이 올라갈 수 있으면?
                    int tr = truck.poll();  // 트럭 준비
                    sum += tr;  // 현재 중량에 트럭 값 추가
                    bridge.offer(tr); // 트럭 다리에 올려주기
                } else bridge.offer(0); // 트럭이 올라갈수 없으면 빈칸 추가.
                res++;
            }
            if (truck.isEmpty() && sum == 0) break; // 남은 트럭이 없고 다리가 비었으면 break.
        }
        System.out.println(res);
    }
}
