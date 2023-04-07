import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LV09_B1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();

        String str = rd.readLine();

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                arr.add(sb.toString());
                arr.add(Character.toString(str.charAt(i)));
                sb = new StringBuilder();
            } else {
                sb.append(str.charAt(i));
            }
        }
        arr.add(sb.toString());

        int N = Integer.parseInt(arr.get(0));
        for (int i = 1; i < arr.size(); i += 2) {
            if (arr.get(i).equals("+"))
                N += Integer.parseInt(arr.get(i + 1));
            else {
                for (int j = i + 1; j < arr.size(); j += 2)
                    N -= Integer.parseInt(arr.get(j));
                break;
            }
        }
        System.out.println(N);
    }
}


// 20 + 90 - 30 + 50 - 30 + 10 - 20 + 50 + 90
// 마이너스가 하나 있으면 그 뒤로는 마이너스로 무조건 만들 수 있다.
