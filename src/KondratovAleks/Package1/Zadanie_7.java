package KondratovAleks.Package1;

import java.util.Scanner;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_7 {
    public static int sum(int a,int j, int s) {

        if (j == a) {
            return s;
        } else {
            s += j;
        }
        return sum(a, ++j, s);
    }
    public static void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int a = scanner.nextInt();
        System.out.println(sum(a,1,a));
    }
}
