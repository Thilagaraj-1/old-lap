/*
    data_type[][] var_name = new data_type[rows][cols]
    data_type[][][] var_name = new data_type[tables][rows][cols]
*/

class Arr2 {
    public static void main(String[] arg) {
        /*
         * int x[][] = new int[2][2];
         * x[0][0] = 1;
         * x[0][1] = 2;
         * x[1][0] = 3;
         * x[1][1] = 4;
         */
        int x[][] = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };
        // for(int i=0; i<2; i++){
        // for(int j=0; j<2; j++){
        // System.out.println(x[i][j]);
        // }
        // }
        /*
         * var_name.length returns no of rows in a 2D array
         * var_name[row-index].length returns no of cols in that row
         */
        for (int i = 0; i < x.length; i++) {// rows
            for (int j = 0; j < x[i].length; j++) {// cols
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(x.length);
    }
}