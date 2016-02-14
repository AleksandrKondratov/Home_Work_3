package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_10 {
    public static void move (int count, char a, char b, char c)	{

        if (count == 1) {
            System.out.println ("Peremistit' verhnee kolco so sterzhnya " + a + " na sterzhen' " + b);
            return;
        }
        else	{
            move (count -1, a, c, b);
            move (1, a, b, c);
            move  (count -1, c, b, a);
        }
    }
    public static void Execute(){
        move(5, 'a', 'b', 'c');
    }
}
