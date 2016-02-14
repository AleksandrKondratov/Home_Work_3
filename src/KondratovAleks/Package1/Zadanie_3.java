package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_3 {
    public static void Execute(){
        int count=0;
        for (int i=1; i<1000000; i++){
            int a=i/1000;
            int b=i%1000;
            int sumA = getSum(a);
            int sumB = getSum(b);
            if (sumA==sumB){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int getSum(int c){
        int sum = 0;
        while (c!=0){
            sum = sum + (c % 10);
            c /= 10;
        }
        return sum;
    }
}
