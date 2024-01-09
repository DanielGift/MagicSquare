import java.util.Arrays;

public class MSAutoGrader {
    public static void print2d(int[][] mat){
        for(int[] row :mat){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        int decider;
        try {
            decider = Integer.valueOf(args[0]);
        }
        catch(Exception e){
            decider = 7;
        }

        MagicSquare m = new MagicSquare(new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}});
        MagicSquare ms = new MagicSquare(new int[][]{{1, 1, 1}, {3, 3, 3}, {1, 2, 3}});
        MagicSquare m2 = new MagicSquare(new int[][]{{1, 1, 2}, {3, 2, 3}, {2, 2, 3}});
        MagicSquare m3 = new MagicSquare(new int[][]{{1, 2, 3}, {10, 4, 9}, {5, 7, 8}});
        MagicSquare m4 = new MagicSquare(new int[][]{{1, 2, 3}, {8, 4, 9}, {5, 7, 8}});
        MagicSquare m5 = new MagicSquare(new int[][]{{6, 2, 3}, {10, 4, 9}, {5, 7, 8}});
        MagicSquare m44 = new MagicSquare(new int[][]{{1, 15, 14, 4}, {10, 11, 8, 5}, {7, 6, 9, 12}, {16, 2, 3, 13}});
        MagicSquare m77 = new MagicSquare(new int[][]{{22, 47, 16, 41, 10, 35, 4},
                {5, 23, 48, 17, 42, 11, 29},
                {30, 6, 24, 49, 18, 36, 12},
                {13, 31, 7, 25, 43, 19, 37},
                {38, 14, 32, 1, 26, 44, 20},
                {21, 39, 8, 33, 2, 27, 45},
                {46, 15, 40, 9, 34, 3, 28}});

        if(decider ==1) {
            for (int i = 0; i < 3; i++) {
                System.out.println(m.rowSum(i));
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(ms.rowSum(i));
            }
        }
        if(decider == 2) {
            for (int i = 0; i < 3; i++) {
                System.out.println(m.colSum(i));
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(ms.colSum(i));
            }
        }
        if(decider == 3) {
            System.out.println(m.diagSums(15));
            System.out.println(m.diagSums(14));
            System.out.println(m.diagSums(1));
            System.out.println(ms.diagSums(15));
            System.out.println(ms.diagSums(7));
            System.out.println(ms.diagSums(5));
            System.out.println(m2.diagSums(6));
            System.out.println(m2.diagSums(7));
        }
        if(decider==4) {
            System.out.println(m.exactlyOnce());
            System.out.println(ms.exactlyOnce());
            System.out.println(m3.exactlyOnce());
            System.out.println(m4.exactlyOnce());
            System.out.println(m5.exactlyOnce());
        }
        if(decider == 5){
            System.out.println(m.isMagic());
            System.out.println(ms.isMagic());
            System.out.println(m44.isMagic());
            System.out.println(m77.isMagic());
        }
        if(decider ==6){
            MagicSquare auto3 = new MagicSquare(3);
            print2d(auto3.square);
            MagicSquare auto5 = new MagicSquare(5);
            print2d(auto5.square);
            MagicSquare auto9 = new MagicSquare(9);
            print2d(auto9.square);
            MagicSquare auto2 = new MagicSquare(2);
            print2d(auto2.square);
            MagicSquare auto1 = new MagicSquare(1);
            print2d(auto1.square);
            MagicSquare auto0 = new MagicSquare(0);
            print2d(auto0.square);
            MagicSquare auto3neg = new MagicSquare(-2);
            print2d(auto3neg.square);
            MagicSquare auto6 = new MagicSquare(6);
            print2d(auto6.square);
        }
        if(decider ==7){
            MagicSquare auto4 = new MagicSquare(4);
            print2d(auto4.square);
            MagicSquare auto8 = new MagicSquare(8);
            print2d(auto8.square);
            MagicSquare auto12 = new MagicSquare(12);
            print2d(auto12.square);
        }
    }
}
