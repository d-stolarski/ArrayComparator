public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator ac = new ArrayComparator();

        int[][] tab1 = new int[3][2];
        tab1[0][0] = 1;
        tab1[0][1] = 1;
        tab1[1][0] = 1;
        tab1[1][1] = 1;
        tab1[2][0] = 1;
        tab1[2][1] = 1;
        int[][] tab2 = new int[2][2];
        tab2[0][0] = 1;
        tab2[0][1] = 1;
        tab2[1][0] = 1;
        tab2[1][1] = 1;
        System.out.println("Tablice są identyczne? " + ac.compare(tab1, tab2));

        int[][] tab3 = new int[2][2];
        tab3[0][0] = 1;
        tab3[0][1] = 1;
        tab3[1][0] = 1;
        tab3[1][1] = 1;
        int[][] tab4 = new int[2][3];
        tab4[0][0] = 1;
        tab4[0][1] = 1;
        tab4[0][2] = 1;
        tab4[1][0] = 1;
        tab4[1][1] = 1;
        tab4[1][2] = 1;
        System.out.println("Tablice są identyczne? " + ac.compare(tab3, tab4));

        int[][] tab5 = new int[2][2];
        tab5[0][0] = 1;
        tab5[0][1] = 1;
        tab5[1][0] = 1;
        tab5[1][1] = 1;
        int[][] tab6 = new int[2][2];
        tab6[0][0] = 1;
        tab6[0][1] = 1;
        tab6[1][0] = 2;
        tab6[1][1] = 1;
        System.out.println("Tablice są identyczne? " + ac.compare(tab5, tab6));

        int[][] tab7 = new int[2][2];
        tab7[0][0] = 1;
        tab7[0][1] = 1;
        tab7[1][0] = 1;
        tab7[1][1] = 1;
        int[][] tab8 = new int[2][2];
        tab8[0][0] = 1;
        tab8[0][1] = 1;
        tab8[1][0] = 1;
        tab8[1][1] = 1;
        System.out.println("Tablice są identyczne? " + ac.compare(tab7, tab8));

    }
}
