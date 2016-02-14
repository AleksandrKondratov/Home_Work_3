package KondratovAleks.Package1;

import java.util.Scanner;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_9 {
    public static void Execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int n = scanner.nextInt();
        Sum(1,1,0,n);
        System.out.println(kk(n));
    }
    public static void Sum(int a, int b, int sum, int n) {
        if (n == 0) {
            System.out.println(sum);
        } else {
            sum = a + b;
            a = b;
            b = sum;
            Sum(a, b, sum, n - 1);
        }
    }
    public static int kk(int d){
        int a=1,b=1,sum=0;
        for(int i=0;i<d;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
