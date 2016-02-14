package KondratovAleks.Package1;

/**
 * Created by user on 13.02.16.
 */
public class Zadanie_6 {
    public static void Execute() {
        int index=0;
        int mul=1;
        int[][] Mas = new int[7][4];
        for(int i=0;i<Mas.length;i++) {
            int mul1 = 1;
            for (int j = 0; j < Mas[i].length; j++) {
                Mas[i][j] = (int) (Math.random() * 11) -5;
                System.out.print(Mas[i][j] + " ");
                mul1 *= Math.abs(Mas[i][j]);
            }
            System.out.println();
            if (mul1 > mul) {
                mul = mul1;
                index = i;
            }

        }
        System.out.println("Stroka "+index+" s naibolshum proizvedeniem");
    }
}

