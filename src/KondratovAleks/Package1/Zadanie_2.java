package KondratovAleks.Package1;

import java.util.Scanner;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_2 {
    public static void Execute(){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        System.out.println(funkciya(d));
    }
    public static int funkciya(int d){
        int a=1,b=1,sum=1;
        for(int i=2;i<d;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
