package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_4 {
    public static void Execute(){
        int count=0;
        for (int a=0; a<24; a++){
            int sumA = getSum(a);
            for (int b=0; b<60; b++) {
                int sumB = getSum(b);
                if (sumA == sumB) {
                    count++;
                }
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
