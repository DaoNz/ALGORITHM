import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] wSt = {  {'W','B','W','B','W','B','W','B'},
                          {'B','W','B','W','B','W','B','W'},
                          {'W','B','W','B','W','B','W','B'},                          
                          {'B','W','B','W','B','W','B','W'},                        
                          {'W','B','W','B','W','B','W','B'},                       
                          {'B','W','B','W','B','W','B','W'},                       
                          {'W','B','W','B','W','B','W','B'},
                          {'B','W','B','W','B','W','B','W'}};
        char[][] bSt = {  {'B','W','B','W','B','W','B','W'},
                          {'W','B','W','B','W','B','W','B'},
                          {'B','W','B','W','B','W','B','W'},
                          {'W','B','W','B','W','B','W','B'},
                          {'B','W','B','W','B','W','B','W'},
                          {'W','B','W','B','W','B','W','B'},
                          {'B','W','B','W','B','W','B','W'},
                          {'W','B','W','B','W','B','W','B'}};

        int N = sc.nextInt(), M = sc.nextInt();
        char[][] input = new char[N][M];
        int[][] check = new int[N-7][M-7];

        for(int i=0; i<N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++)
                input[i][j] = str.charAt(j);
        }

        int wCheck = 0, bCheck = 0;

        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                for(int x=0; x<8; x++) {
                    for(int y=0; y<8; y++) {
                        if(input[i+x][j+y] == wSt[x][y])
                            wCheck++;
                        if(input[i+x][j+y] == bSt[x][y])
                            bCheck++;
                    }
                }
                check[i][j] = Math.min(wCheck, bCheck);
                wCheck = 0; bCheck = 0;
            }
        }

        int res = Integer.MAX_VALUE;

        for (int [] i1 : check) {
            for (int i2 : i1)
                res = Math.min(res,i2);
        }
        System.out.println(res);

//        for(char[] c1 : input) {
//            for (char c2 : c1)
//                System.out.print(c2 + " ");
//            System.out.println();
//        }
//        for(int [] i1 : check) {
//            for (int i2 : i1)
//                System.out.print(i2 + " ");
//            System.out.println();

    }
}
