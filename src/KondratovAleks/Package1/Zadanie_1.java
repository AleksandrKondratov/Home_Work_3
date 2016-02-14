package KondratovAleks.Package1;

import java.util.Scanner;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_1 {
    public static void Execute(){
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vvedite chislo: ");
        int a=scanner.nextInt();
        while(a!=0){
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
