package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_8 {

    public static void Execute(){
        Fibo rr = new Fibo();
        int rez = rr.calc_count(15);
        System.out.println(" 4 element vuchituvalsa " + rez + " raz(a");

    }
}
class Fibo{
    private int counter =0;
    private int a = 1;
    private int b = 1;
    private int sum = 1;
    private int i = 2;

    int calc_count(int d) {

        if (i == 4)
            ++counter;

        if (i == d)
            return counter;

        sum = a + b;
        a = b;
        b = sum;
        i++;
        return calc_count(d);
    }
}
