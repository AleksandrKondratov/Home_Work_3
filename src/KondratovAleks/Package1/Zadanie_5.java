package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_5 {
    public static void Execute(){
        int[][] Mas = new int[8][5];
        for(int i=0;i<Mas.length;i++) {
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(Mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
