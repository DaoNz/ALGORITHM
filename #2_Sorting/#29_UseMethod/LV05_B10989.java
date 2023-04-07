// 수 정렬하기 3
// N은 최대 10,000,000개이고, 수들은 10,000보다 작거나 같은 자연수
// Java같은 경우는 3초가 주어지기 때문에 300,000,000번의 연산 이내로 풀어야 함.
// log(N)이 약 23. Nlog(N)의 시간 복잡도로 풀 수 있다.

// sb.append(i + "\n) 사용시 메모리 초과.
// 바꾸니까 통과. 왜 메모리 초과지..?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LV05_B10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(read.readLine());
        int[] res = new int[N];

        for(int i=0; i<N; i++) res[i] = Integer.parseInt(read.readLine());
        Arrays.sort(res);

        for(int i : res) sb.append(i).append("\n");
        System.out.print(sb);

        //ArrayList<Integer> arr = new ArrayList<>();
        //arr.add(Integer.parseInt(read.readLine()));
        //Collections.sort(arr);
        //for(int i : arr) sb.append(i+"\n");
    }
}
