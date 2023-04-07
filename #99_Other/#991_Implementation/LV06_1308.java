import java.util.Scanner;

public class LV06_1308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sY = sc.nextInt(), sM = sc.nextInt(), sD = sc.nextInt();
        int eY = sc.nextInt(), eM = sc.nextInt(), eD = sc.nextInt();
        int dDay = 0;

        if (sY+1000 < eY
                ||(sY+1000 == eY && sM < eM)
                ||(sY+1000 == eY && sM == eM && sD < eD)
                ||(sY+1000 == eY && sM == eM && sD == eD))
            System.out.println("gg");
         
        else {
            while (sY < eY || sM < eM || sD < eD) {
                dDay++;
                eD--;
                if (eD == 0) {
                    eM--;
                    if (eM == 0) {
                        eY--;
                        eM = 12;
                        eD = 31;
                    } else if (eM == 2) {

                        if (eY % 4 == 0 || eY % 400 == 0) {
                            eD = 29;
                            if (eY%400 != 0 && eY % 100 == 0)
                                eD = 28;
                        } else
                            eD = 28;

                    } else if (eM == 4 || eM == 6 || eM == 9 || eM == 11) {
                        eD = 30;
                    } else
                        eD = 31;
                }
            }
            System.out.println("D-" + dDay);
        }
    }
}
