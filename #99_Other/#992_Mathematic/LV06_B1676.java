import java.math.BigInteger;
import java.util.Scanner;

public class LV06_B1676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fac = BigInteger.ONE;
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
      
        String str = fac.toString();
        int count = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == '0') count++;
            else break;
        }
      
        System.out.println(count);
    }
}
