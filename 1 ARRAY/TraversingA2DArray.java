public class TraversingA2DArray {
    public static void main(String[] args) {
      //  int[][] arr = new int [3][4];    // total element =  12
        /* first [] is used for the length of main array
        * second [] is used for  the length of each array element  */
         int [][] arr= {{2,2,3,1},{2,35,33,5},{3,5,2,4}};
         /*
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length ; j++){
                System.out.print( arr[i][j]  + "  ");
            }
            *
          */
        // the above loops can be optimised using enhanced  for loop
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
        }
    }
}
