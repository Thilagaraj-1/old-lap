/*
Arrays
    data_type var_name[] = new data_type[size];
    data_type[] var_name = new data_type[size];

    data_type var_name[];
    var_name = new data_type[size];
*/

class Arr1 {
    public static void main(String[] arg) {
        /*
         * int x[] = new int[5];
         * x[0]=1;
         * x[1]=2;
         * x[2]=3;
         * x[3]=4;
         * x[4]=5;
         */
        int x[] = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        int sum = 0;

        for (int t : x) {
            sum += t;
            System.out.println(t);
        }
        System.out.println(sum);
        System.out.println("Retuns no of elements in an Array " + x.length);

    }
}
/*
 * for(data_type temp_var : array){
 * 
 * }
 */